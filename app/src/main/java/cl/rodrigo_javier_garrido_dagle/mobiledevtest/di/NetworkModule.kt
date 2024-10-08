package cl.rodrigo_javier_garrido_dagle.mobiledevtest.di

import cl.rodrigo_javier_garrido_dagle.mobiledevtest.BuildConfig.URL_BASE
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.network.interceptors.HeaderInterceptor
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
   fun provideHoroscopeApiService(retrofit: Retrofit): HoroscopeApiService {
      return retrofit.create(HoroscopeApiService::class.java)
   }

   @Provides
   fun provideRepository(apiService: HoroscopeApiService): Repository {
      return RepositoryImpl(apiService)
   }
}