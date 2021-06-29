package com.bmaexperiences.misterautotodolist.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/activity/TasksActivity;", "Lcom/bmaexperiences/misterautotodolist/global/GlobalActivity;", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getIdTask", "", "loadRecyclerView", "", "tasks", "", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateConnection", "isConnected", "", "app_debug"})
public final class TasksActivity extends com.bmaexperiences.misterautotodolist.global.GlobalActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    
    public TasksActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void updateConnection(boolean isConnected) {
    }
    
    private final void loadRecyclerView(java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> tasks) {
    }
    
    private final int getIdTask() {
        return 0;
    }
}