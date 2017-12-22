package com.example.mirry.iflydemo;

import android.app.Application;
import android.content.Context;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Mirry on 2017/10/30.
 */

public class MyApplication extends Application {
    private static Context context;

    public void onCreate(){
        super.onCreate();
        MyApplication.context = getApplicationContext();
        // 初始化语音识别
        SpeechUtility.createUtility(context, SpeechConstant.APPID +"=59f6fea2");
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }

}
