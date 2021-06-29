package com.bmaexperiences.misterautotodolist.roomdb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/roomdb/DatabaseDao;", "", "getTasks", "", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTasks", "", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUsers", "app_debug"})
public abstract interface DatabaseDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table")
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM task_table WHERE userId = :id")
    public abstract java.lang.Object getTasks(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity>> p1);
}