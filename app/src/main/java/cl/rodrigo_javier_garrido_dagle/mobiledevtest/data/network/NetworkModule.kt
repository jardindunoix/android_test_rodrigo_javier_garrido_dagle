package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.interceptors.HeaderInterceptor
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepository
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.domain.repositories.NetworkRepositoryImpl
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.URL_BASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

   @Provides
   @Singleton
   fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
      return Retrofit
         .Builder()
         .baseUrl(URL_BASE)
         .client(okHttpClient)
         .addConverterFactory(GsonConverterFactory.create())
         .build()
   }

   @Provides
   @Singleton
   fun provideOkHttpClient(headerInterceptor: HeaderInterceptor): OkHttpClient {
      val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

      return OkHttpClient
         .Builder()
         .addInterceptor(interceptor)
         .addInterceptor(headerInterceptor)
         .build()
   }

   @Provides
   fun provideApiService(retrofit: Retrofit): ApiCalls {
      return retrofit.create(ApiCalls::class.java)
   }

   @Provides
   fun provideNetworkRepository(apiService: ApiCalls): NetworkRepository {
      return NetworkRepositoryImpl(apiService)
   }
}