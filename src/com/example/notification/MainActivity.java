package com.example.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

   Button notificationButton = (Button) findViewById(R.id.button1);

   notificationButton.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View v) {
    Notify("Title: Meeting with Business",
      "Msg:Ujjian 10:00 AM ");
   }
  });
 }

  @SuppressWarnings("deprecation")
 private void Notify(String notificationTitle, String notificationMessage) {
  NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
  @SuppressWarnings("deprecation")
  Notification notification = new Notification(R.drawable.msg,
    "New Message", System.currentTimeMillis());

   Intent notificationIntent = new Intent(this, MainActivity.class);
  PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
    notificationIntent, 0);

   notification.setLatestEventInfo(MainActivity.this, notificationTitle,
    notificationMessage, pendingIntent);
  notificationManager.notify(9999, notification);
 }

}