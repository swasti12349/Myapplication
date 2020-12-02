package com.sro.myapplication;

import android.app.Application;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.onesignal.OneSignal;

public class OneSignalInit extends Application {

    private static OneSignalInit mInstance;

    public OneSignalInit(){
        mInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .setNotificationOpenedHandler(result -> {
                    //PREFORM ON CLICK ACTION HERE
                })
                .init();
    }

    public static synchronized OneSignalInit getInstance(){
        return mInstance;
    }


}