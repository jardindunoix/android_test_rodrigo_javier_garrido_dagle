package cl.rodrigo_javier_garrido_dagle.mobiledevtest.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "hit"
)
data class HitEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "tags")
    val tags: List<String?>?,
    @ColumnInfo(name = "author")
    val author: String?,
    @ColumnInfo(name = "children")
    val children: List<Int?>?,
    @ColumnInfo(name = "comment_text")
    val commentText: String?,
    @ColumnInfo(name = "created_at")
    val createdAt: String?,
    @ColumnInfo(name = "created_at_id")
    val createdAtI: Int?,
    @ColumnInfo(name = "num_comments")
    val numComments: Int?,
    @ColumnInfo(name = "object_id")
    val objectID: String?,
    @ColumnInfo(name = "parent_id")
    val parentId: Int?,
    @ColumnInfo(name = "points")
    val points: Int?,
    @ColumnInfo(name = "story_id")
    val storyId: Int?,
    @ColumnInfo(name = "story_text")
    val storyText: String?,
    @ColumnInfo(name = "story_title")
    val storyTitle: String?,
    @ColumnInfo(name = "story_url")
    val storyUrl: String?,
    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "updated_at")
    val updatedAt: String?,
    @ColumnInfo(name = "url")
    val url: String?
)