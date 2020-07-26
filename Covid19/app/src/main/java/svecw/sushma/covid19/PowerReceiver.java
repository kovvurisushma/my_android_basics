package svecw.sushma.covid19;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()) {
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context , "CONNECTED" , Toast.LENGTH_LONG);
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context , "DIS CONNECTED" , Toast.LENGTH_SHORT);
                break;
        }
    }
}
