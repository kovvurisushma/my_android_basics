package svecw.sushma.demoapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button toast , plus , minus;
TextView tv;
int x  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast_button);
        plus= findViewById(R.id.plus_button);
        minus = findViewById(R.id.minus_button);
        tv = findViewById(R.id.txt_view);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this , "value is : " + x , Toast.LENGTH_SHORT).show();
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                tv.setText(""+x);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x--;
                tv.setText(""+x);
            }
        });

    }
}