package com.bmaexperiences.misterautotodolist.global;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0011J\u001f\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/global/GlobalViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "database", "Lcom/bmaexperiences/misterautotodolist/roomdb/DatabaseDao;", "taskVM", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "getTaskVM", "()Landroidx/lifecycle/MutableLiveData;", "userVM", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "getUserVM", "getLocalTasks", "", "id", "", "getLocalUsers", "getTasks", "getUsers", "saveTasksInDatabase", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUsersInDatabase", "app_debug"})
public final class GlobalViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.bmaexperiences.misterautotodolist.roomdb.DatabaseDao database = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity>> userVM = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity>> taskVM = null;
    
    public GlobalViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity>> getUserVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity>> getTaskVM() {
        return null;
    }
    
    public final void getUsers() {
    }
    
    public final void getLocalUsers() {
    }
    
    private final java.lang.Object saveUsersInDatabase(java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> users, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void getTasks(int id) {
    }
    
    private final java.lang.Object saveTasksInDatabase(java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> users, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void getLocalTasks(int id) {
    }
}