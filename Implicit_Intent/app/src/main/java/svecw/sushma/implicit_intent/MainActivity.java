package svecw.sushma.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et;
Button dial , share , whats_app;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et_text);
        dial = findViewById(R.id.bt_dail);
        share = findViewById(R.id.bt_share);
        whats_app = findViewById(R.id.bt_wats_app);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                s = et.getText().toString();
                intent.setData(Uri.parse("tel:"+s));
                startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = et.getText().toString();
                ShareCompat.IntentBuilder.from(MainActivity.this)
                        .setType("text/plain")
                        .setChooserTitle("choose any of the apps")
                        .setText(s)
                        .startChooser();
            }
        });

        whats_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(intent);
            }
        });
    }
}