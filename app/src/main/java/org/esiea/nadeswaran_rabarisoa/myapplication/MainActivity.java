package org.esiea.nadeswaran_rabarisoa.myapplication;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.*;
import android.widget.*;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hw = (TextView)findViewById(R.id.tv_hw);
        Button btn_hw = (Button) findViewById(R.id.btn_hw);
        String now = DateUtils.formatDateTime(getApplicationContext(),(new Date()).getTime(), DateFormat.FULL);
        tv_hw.setText(now);
        btn_hw.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), getString(R.string.hello_world), Toast.LENGTH_LONG).show();
        notification_test();
    }

    public void notification_test(){
        NotificationCompat.Builder noti = new NotificationCompat.Builder(this);
        noti.setSmallIcon(R.mipmap.ic_launcher);
        noti.setContentTitle("Notification");
        noti.setContentText("Voici une notification");
        NotificationManager notiManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notiManager.notify(1, noti.build());
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toast_me, menu);
        return true;
    }
}
