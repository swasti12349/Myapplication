package com.sro.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

public class OneSignalService extends NotificationExtenderService
{
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult receivedResult) {
        // Read properties from result.

        // Return true to stop the notification from displaying.
        return false;
    }

}