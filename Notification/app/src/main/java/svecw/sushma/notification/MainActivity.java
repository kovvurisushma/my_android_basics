package svecw.sushma.notification;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.bt_send_notification);


        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)  {
                    NotificationChannel notificationChannel = new NotificationChannel("no_something_else" , "active_students" , NotificationManager.IMPORTANCE_HIGH);
                    notificationChannel.enableLights(true);
                    notificationChannel.enableVibration(true);
                    notificationManager.createNotificationChannel(notificationChannel);
                }

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this , "no_something_else");
                builder.setSmallIcon(R.drawable.time);
                builder.setContentTitle("SAMPLE NOTIFICATION");
                builder.setContentText("Android id interesting");
                builder.setAutoCancel(true);


                
                notificationManager.notify(23 , builder.build());

            }
        });
    }
}