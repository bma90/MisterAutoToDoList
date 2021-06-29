package com.bmaexperiences.misterautotodolist.retrofit

import com.bmaexperiences.misterautotodolist.model.TaskEntity
import com.bmaexperiences.misterautotodolist.model.UserEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Class that perform server call
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers() : Response<List<UserEntity>>

    @GET("posts")
    suspend fun getUserTask(@Query("userId") userId : Int) : Response<List<TaskEntity>>

}