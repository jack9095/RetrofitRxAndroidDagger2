package com.micky.retrofitrxandroiddagger2;

import android.app.Application;

import com.micky.retrofitrxandroiddagger2.common.utils.CrashHandler;


public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
