package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.entities.HitEntity

@Dao
interface HitsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllData(list: List<HitEntity>)

    @Query("SELECT * FROM hit")
    suspend fun getAllData(): List<HitEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHit(hit: HitEntity) {

    }
}