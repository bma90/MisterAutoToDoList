package com.bmaexperiences.misterautotodolist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter$UserInterface;", "users", "", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "(Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter$UserInterface;Ljava/util/List;)V", "getItemCount", "", "getRandomColor", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUsers", "newUsers", "UserInterface", "UserViewHolder", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final com.bmaexperiences.misterautotodolist.adapter.UserAdapter.UserInterface listener = null;
    private java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> users;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.bmaexperiences.misterautotodolist.adapter.UserAdapter.UserInterface listener, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> users) {
        super();
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bmaexperiences.misterautotodolist.model.UserEntity> newUsers) {
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
    
    private final int getRandomColor() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter$UserInterface;", "", "onClickUser", "", "user", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "app_debug"})
    public static abstract interface UserInterface {
        
        public abstract void onClickUser(@org.jetbrains.annotations.NotNull()
        com.bmaexperiences.misterautotodolist.model.UserEntity user);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bmaexperiences/misterautotodolist/adapter/UserAdapter;Landroid/view/View;)V", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "parent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getParent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "userColor", "Landroid/widget/LinearLayout;", "getUserColor", "()Landroid/widget/LinearLayout;", "bind", "", "user", "Lcom/bmaexperiences/misterautotodolist/model/UserEntity;", "app_debug"})
    final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nameTV = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout userColor = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout parent = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNameTV() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getUserColor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getParent() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bmaexperiences.misterautotodolist.model.UserEntity user) {
        }
    }
}