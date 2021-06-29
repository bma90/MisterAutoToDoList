package com.bmaexperiences.misterautotodolist.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bmaexperiences.misterautotodolist.model.TaskEntity
import com.bmaexperiences.misterautotodolist.model.UserEntity

/**
 * Create the instance of local database
 */
@Database(entities = [UserEntity::class, TaskEntity::class], version = 2)
abstract class Database : RoomDatabase() {

    abstract val dao : DatabaseDao

       companion object{

           @Volatile
           private var INSTANCE : com.bmaexperiences.misterautotodolist.roomdb.Database? = null

           fun getInstance(context: Context) : com.bmaexperiences.misterautotodolist.roomdb.Database{
               synchronized(this){
                   var instance = INSTANCE

                   if (instance==null){
                       instance = Room.databaseBuilder(
                           context,
                           com.bmaexperiences.misterautotodolist.roomdb.Database::class.java,
                           "database"
                       ).fallbackToDestructiveMigration().build()

                       INSTANCE = instance
                   }

                   return instance
               }
           }

       }

}