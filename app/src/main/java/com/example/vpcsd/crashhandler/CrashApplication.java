package com.example.vpcsd.crashhandler;

import android.app.Application;

/**
 * Created by vpcsd on 2016/9/19.
 */
public class CrashApplication extends Application{

    private static CrashApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        //在这里为应用设置异常处理，然后程序才能获取未处理的异常
        CrashHandler crashHandler = CrashHandler.getsInstance();
        crashHandler.init(this);
    }

    public static CrashApplication getsInstance() {
        return sInstance;
    }
}
