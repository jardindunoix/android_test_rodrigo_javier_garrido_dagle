package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.entities.HitEntity
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Constants.DATABASE_VERSION
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.utilities.Converters


@Database(
    version = DATABASE_VERSION,
    entities = [
        HitEntity::class,
    ],
//   exportSchema = false,
)
@TypeConverters(Converters::class)
abstract class HitsDatabase : RoomDatabase() {
    abstract val dao: HitsDao
}