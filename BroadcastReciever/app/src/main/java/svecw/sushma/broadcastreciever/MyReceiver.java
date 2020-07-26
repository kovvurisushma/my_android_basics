package svecw.sushma.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    ImageView imageView;

    public MyReceiver(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {



        switch (intent.getAction()) {
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context , "CONNECTED" , Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.ic_baseline_battery_charging_full_24);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context , "DisConnected" , Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.charger);
                break;
        }
    }
}
