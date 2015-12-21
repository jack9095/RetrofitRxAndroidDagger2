package com.micky.retrofitrxandroiddragger2;

import android.app.Application;

import com.micky.retrofitrxandroiddragger2.common.utils.CrashHandler;

/**
 * @Project RetrofitRxAndroidDragger2
 * @Packate com.micky.retrofitrxandroiddragger2
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2015-12-21 17:47
 * @Version 0.1
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
    }
}
