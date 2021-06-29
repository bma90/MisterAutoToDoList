package com.bmaexperiences.misterautotodolist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bmaexperiences.misterautotodolist.R
import com.bmaexperiences.misterautotodolist.model.TaskEntity

class TaskAdapter(private var tasks : List<TaskEntity>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun setTasks(newTasks : List<TaskEntity>){
        tasks = newTasks
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_task, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is UserViewHolder) holder.bind(tasks[position])
    }

    override fun getItemCount(): Int = tasks.size


    private inner class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val titleTV: TextView = itemView.findViewById(R.id.title_task)
        val bodyTV: TextView = itemView.findViewById(R.id.body_task)
        val parent: ConstraintLayout = itemView.findViewById(R.id.parent_task)

        fun bind(task : TaskEntity){
            titleTV.text = task.title
            bodyTV.text = task.body
            parent.setOnClickListener {
                if (bodyTV.visibility==View.GONE) bodyTV.visibility = View.VISIBLE
                else bodyTV.visibility = View.GONE
            }
        }
    }

}