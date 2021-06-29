package com.bmaexperiences.misterautotodolist.activity

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bmaexperiences.misterautotodolist.R
import com.bmaexperiences.misterautotodolist.adapter.TaskAdapter
import com.bmaexperiences.misterautotodolist.customization.MarginCustomerList
import com.bmaexperiences.misterautotodolist.global.GlobalActivity
import com.bmaexperiences.misterautotodolist.model.TaskEntity

class TasksActivity : GlobalActivity() {

    private var recyclerView : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        viewModel.taskVM.observe(this, { tasks ->
            if (tasks.isNotEmpty()) loadRecyclerView(tasks)
        })
    }

    /**
     * called when has connection update
     * get the tasks in local or with web service
     * @param isConnected : true = use web service / false = get local data
     */
    override fun updateConnection(isConnected: Boolean) {
        if (isConnected) viewModel.getTasks(getIdTask())
        else viewModel.getLocalTasks(getIdTask())
    }

    /**
     * load the recycler view with the list
     * @param tasks : list of tasks retrieve
     */
    private fun loadRecyclerView(tasks : List<TaskEntity>){
        if (recyclerView==null){
            recyclerView =  findViewById(R.id.task_recyclerview)
            recyclerView?.apply {
                layoutManager = LinearLayoutManager(this@TasksActivity)
                adapter = TaskAdapter(tasks)
                addItemDecoration(MarginCustomerList())
                addItemDecoration(DividerItemDecoration(this@TasksActivity, LinearLayoutManager.VERTICAL))
            }
        }else{
            val t = recyclerView?.adapter as TaskAdapter
            t.setTasks(tasks)
        }
    }

    /**
     * get the id in intent
     * @return Id of the user selected
     */
    private fun getIdTask() : Int{
        var idUser = -1
        if (intent.hasExtra("idUser")){
            idUser = intent.getIntExtra("idUser", -1)
        }
        return idUser
    }

}