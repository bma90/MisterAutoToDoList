package com.bmaexperiences.misterautotodolist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class UserEntity(
    @PrimaryKey
    val id : Int,
    val name : String
)
