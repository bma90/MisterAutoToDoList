package com.bmaexperiences.misterautotodolist.global

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bmaexperiences.misterautotodolist.model.TaskEntity
import com.bmaexperiences.misterautotodolist.model.UserEntity
import com.bmaexperiences.misterautotodolist.retrofit.CallApi
import com.bmaexperiences.misterautotodolist.roomdb.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GlobalViewModel(application : Application) : AndroidViewModel(application) {

    private val database = Database.getInstance(application).dao

    val userVM = MutableLiveData<List<UserEntity>>()

    val taskVM = MutableLiveData<List<TaskEntity>>()

    //============================= Users

    /**
     * perform the call to get users with Web service
     */
    fun getUsers(){
        viewModelScope.launch(Dispatchers.IO){
            try{
                val request = CallApi.apiService.getUsers()
                if (request.code()==200){
                    val users = request.body() ?: ArrayList<UserEntity>()
                    userVM.postValue(users)
                    saveUsersInDatabase(users)
                }
            }catch (e : Exception){
                Log.e("MisterAutoError", "error user server call : ${e.message}")
            }

        }
    }

    /**
     * perform the call to get users in local database
     */
    fun getLocalUsers() {
        viewModelScope.launch(Dispatchers.IO){
            userVM.postValue(database.getUsers())
        }
    }

    /**
     * save the list of users in local database
     * @param users : list of users to save
     */
    private suspend fun saveUsersInDatabase(users : List<UserEntity>){
        database.saveUsers(users)
    }

    //============================= Tasks
    /**
     * perform the call to get tasks with Web service
     */
    fun getTasks(id : Int){
        if (id>-1){
            viewModelScope.launch(Dispatchers.IO){
                try {
                    val request = CallApi.apiService.getUserTask(id)
                    if (request.code()==200){
                        val tasks = request.body() ?: ArrayList<TaskEntity>()
                        taskVM.postValue(tasks)
                        saveTasksInDatabase(tasks)
                    }
                }catch (e : Exception){
                    Log.e("MisterAutoError", "error task server call : ${e.message}")
                }
            }
        }
    }

    /**
     * save the list of users in local database
     * @param tasks : list of tasks to save
     */
    private suspend fun saveTasksInDatabase(tasks : List<TaskEntity>){
        database.saveTasks(tasks)
    }

    /**
     * perform the call to get tasks in local database
     */
    fun getLocalTasks(id: Int) {
        viewModelScope.launch(Dispatchers.IO){
            taskVM.postValue(database.getTasks(id))
        }
    }


}