package com.bmaexperiences.misterautotodolist.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/activity/MainActivity;", "Lcom/bmaexperiences/misterautotodolist/global/GlobalActivity;", "Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter$UserInterface;", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "loadRecyclerView", "", "users", "", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "onClickUser", "user", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateConnection", "isConnected", "", "app_debug"})
public final class MainActivity extends com.bmaexperiences.misterautotodolist.global.GlobalActivity implements com.bmaexperiences.misterautotodolist.adapter.UserAdapter.UserInterface {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void updateConnection(boolean isConnected) {
    }
    
    private final void loadRecyclerView(java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> users) {
    }
    
    @java.lang.Override()
    public void onClickUser(@org.jetbrains.annotations.NotNull()
    com.bmaexperiences.misterautotodolist.model.UserEntity user) {
    }
}