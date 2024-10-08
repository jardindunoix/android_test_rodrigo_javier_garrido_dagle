package cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.Date


class Converters {

   @TypeConverter
   fun fromString(value: String?): List<String> {
      val listType = object : TypeToken<List<String>>() {}.type
      return Gson().fromJson(
         value,
         listType
      )
   }

   @TypeConverter
   fun fromArrayList(list: List<String?>?): String {
      return Gson().toJson(list)
   }

   @TypeConverter
   fun fromTimestamp(value: Long?): Date? {
      return if (value == null) null else Date(value)
   }

   @TypeConverter
   fun dateToTimestamp(date: Date?): Long? {
      return date?.time
   }
}