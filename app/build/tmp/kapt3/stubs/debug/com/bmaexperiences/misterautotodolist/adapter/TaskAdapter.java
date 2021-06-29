package com.bmaexperiences.misterautotodolist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/adapter/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "tasks", "", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTasks", "newTasks", "UserViewHolder", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> tasks;
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> tasks) {
        super();
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> newTasks) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/adapter/TaskAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bmaexperiences/misterautotodolist/adapter/TaskAdapter;Landroid/view/View;)V", "bodyTV", "Landroid/widget/TextView;", "getBodyTV", "()Landroid/widget/TextView;", "parent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getParent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "titleTV", "getTitleTV", "bind", "", "task", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "app_debug"})
    final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView bodyTV = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout parent = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBodyTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getParent() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bmaexperiences.misterautotodolist.model.TaskEntity task) {
        }
    }
}