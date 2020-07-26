package svecw.sushma.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button data , url , phn , map;
EditText e1 , e2 , e3, e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = findViewById(R.id.bt_data);
        url = findViewById(R.id.bt_url);
        phn = findViewById(R.id.bt_num);
        map = findViewById(R.id.bt_map);
        e1 = findViewById(R.id.et_data);
        e2 = findViewById(R.id.et_url);
        e3 = findViewById(R.id.et_num);
        e4 = findViewById(R.id.et_map);

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key_data = e1.getText().toString();
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("Second" , key_data);
                startActivity(intent);
            }
        });

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e2.getText().toString();
                Uri uri = Uri.parse("https://www." + s + ".com");
                Intent intent = new Intent(Intent.ACTION_VIEW , uri);
                startActivity(intent);
            }
        });

        phn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e3.getText().toString();
                Uri uri = Uri.parse("tel:" + s);
                Intent intent = new Intent(Intent.ACTION_VIEW , uri);
                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e4.getText().toString();
                Uri uri = Uri.parse("geo:" + s);
                Intent intent = new Intent(Intent.ACTION_VIEW , uri);
                startActivity(intent);
            }
        });



    }
}