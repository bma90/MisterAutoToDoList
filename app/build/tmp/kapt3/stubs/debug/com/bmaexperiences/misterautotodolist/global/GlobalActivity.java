package com.bmaexperiences.misterautotodolist.global;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/bmaexperiences/misterautotodolist/global/GlobalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "internetCallBack", "Landroid/net/ConnectivityManager$NetworkCallback;", "viewModel", "Lcom/bmaexperiences/misterautotodolist/global/GlobalViewModel;", "getViewModel", "()Lcom/bmaexperiences/misterautotodolist/global/GlobalViewModel;", "setViewModel", "(Lcom/bmaexperiences/misterautotodolist/global/GlobalViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateConnection", "isConnected", "", "app_debug"})
public abstract class GlobalActivity extends androidx.appcompat.app.AppCompatActivity {
    protected com.bmaexperiences.misterautotodolist.global.GlobalViewModel viewModel;
    
    /**
     * Allow our activity to check if Pax is connected to internet or not
     */
    private final android.net.ConnectivityManager.NetworkCallback internetCallBack = null;
    
    public GlobalActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.bmaexperiences.misterautotodolist.global.GlobalViewModel getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.bmaexperiences.misterautotodolist.global.GlobalViewModel p0) {
    }
    
    public abstract void updateConnection(boolean isConnected);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}