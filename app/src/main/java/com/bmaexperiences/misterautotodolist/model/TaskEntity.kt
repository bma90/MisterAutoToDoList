package com.bmaexperiences.misterautotodolist.model

import androidx.room.*
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "task_table",
foreignKeys = [ForeignKey(
    entity = UserEntity::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("userId"),
    onDelete = ForeignKey.CASCADE,
    onUpdate = ForeignKey.CASCADE
)],
indices = [Index("userId")])
data class TaskEntity(
    @PrimaryKey
    val id : Int,
    val title : String,
    val body : String,
    val userId : Int
)
