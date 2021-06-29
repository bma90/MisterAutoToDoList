package com.bmaexperiences.misterautotodolist.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bmaexperiences.misterautotodolist.model.TaskEntity
import com.bmaexperiences.misterautotodolist.model.UserEntity

/**
 * class that perform sql request in local database
 */
@Dao
interface DatabaseDao {

    /**
     * save users
     * @param users : users to save
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUsers(users : List<UserEntity>)

    /**
     * get the list of users
     * @return list of users
     */
    @Query("SELECT * FROM user_table")
    suspend fun getUsers() : List<UserEntity>

    /**
     * save tasks
     * @param tasks : tasks to save
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTasks(tasks : List<TaskEntity>)

    /**
     * get the list of tasks
     * @return list of tasks
     */
    @Query("SELECT * FROM task_table WHERE userId = :id")
    suspend fun getTasks(id : Int) : List<TaskEntity>

}