package com.bmaexperiences.misterautotodolist.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bmaexperiences.misterautotodolist.model.TaskEntity
import com.bmaexperiences.misterautotodolist.model.UserEntity

@Dao
interface DatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUsers(users : List<UserEntity>)

    @Query("SELECT * FROM user_table")
    suspend fun getUsers() : List<UserEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTasks(users : List<TaskEntity>)

    @Query("SELECT * FROM task_table WHERE userId = :id")
    suspend fun getTasks(id : Int) : List<TaskEntity>

}