package com.bmaexperiences.misterautotodolist.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/retrofit/ApiService;", "", "getUserTask", "Lretrofit2/Response;", "", "Lcom/bmaexperiences/misterautotodolist/model/TaskEntity;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsers", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "posts")
    public abstract java.lang.Object getUserTask(@retrofit2.http.Query(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.bmaexperiences.misterautotodolist.model.TaskEntity>>> p1);
}