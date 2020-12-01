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

public class message extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {

        showNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
    }
    public void showNotification(String title, String msg){
        Intent i = new Intent(this,MainActivity2.class);
        PendingIntent intent = PendingIntent.getActivity(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"myNotification")
                .setContentIntent(intent)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle(title)
                .setContentText(msg)
                .setAutoCancel(true);


        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        manager.notify(99,builder.build());
    }

}
