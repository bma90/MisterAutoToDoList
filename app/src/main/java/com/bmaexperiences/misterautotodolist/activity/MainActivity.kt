 package com.bmaexperiences.misterautotodolist.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bmaexperiences.misterautotodolist.R
import com.bmaexperiences.misterautotodolist.adapter.UserAdapter
import com.bmaexperiences.misterautotodolist.customization.MarginCustomerList
import com.bmaexperiences.misterautotodolist.global.GlobalActivity
import com.bmaexperiences.misterautotodolist.model.UserEntity

 class MainActivity : GlobalActivity(), UserAdapter.UserInterface {

     private var recyclerView : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.userVM.observe(this, { users ->
            if (users.isNotEmpty()) loadRecyclerView(users)
        })

    }

     /**
      * called when has connection update
      * get the users in local or with web service
      * @param isConnected : true = use web service / false = get local data
      */
     override fun updateConnection(isConnected: Boolean) {
         if (isConnected) viewModel.getUsers()
         else viewModel.getLocalUsers()
     }

     /**
      * load the recycler view with the list
      * @param users : list of users retrieve
      */
     private fun loadRecyclerView(users : List<UserEntity>){
         if (recyclerView==null){
             recyclerView =  findViewById(R.id.user_recyclerview)
             recyclerView?.apply {
                 layoutManager = LinearLayoutManager(this@MainActivity)
                 adapter = UserAdapter(this@MainActivity, users)
                 addItemDecoration(MarginCustomerList())
                 addItemDecoration(DividerItemDecoration(this@MainActivity, LinearLayoutManager.VERTICAL))
             }
         }else{
             val t = recyclerView?.adapter as UserAdapter
             t.setUsers(users)
         }
     }

     /**
      * go to tasks
      * triggered when user click on an item list
      */
     override fun onClickUser(user: UserEntity) {
         val intent = Intent(this, TasksActivity::class.java)
         intent.putExtra("idUser", user.id)
         intent.putExtra("nameUser", user.name)
         startActivity(intent)
     }
 }