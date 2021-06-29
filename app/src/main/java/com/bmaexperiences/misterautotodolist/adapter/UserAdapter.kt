package com.bmaexperiences.misterautotodolist.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bmaexperiences.misterautotodolist.R
import com.bmaexperiences.misterautotodolist.model.UserEntity
import java.util.*

class UserAdapter(private val listener : UserInterface, private var users : List<UserEntity>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface UserInterface{
        fun onClickUser(user: UserEntity)
    }

    fun setUsers(newUsers : List<UserEntity>){
        users = newUsers
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_user, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is UserViewHolder) holder.bind(users[position])
    }

    override fun getItemCount(): Int = users.size


    private inner class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val nameTV: TextView = itemView.findViewById(R.id.name_user)
        val userColor: LinearLayout = itemView.findViewById(R.id.user_color)
        val parent: ConstraintLayout = itemView.findViewById(R.id.parent_user)

        fun bind(user : UserEntity){
            nameTV.text = user.name
            userColor.setBackgroundColor(getRandomColor())
            parent.setOnClickListener { listener.onClickUser(user) }
        }
    }

    /**
     * generate a random color for each user
     * @return int value of the color
     */
    private fun getRandomColor() : Int{
        val random = Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }

}