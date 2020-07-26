package svecw.sushma.hello;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button count;
    TextView tv;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.count_button);
        tv = findViewById(R.id.text_view);
        if(savedInstanceState != null && savedInstanceState.containsKey("COUNT")) {
            c = savedInstanceState.getInt("COUNT");
            tv.setText(""+c);
        }

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                tv.setText(""+c);
            }
        });
    }

    public void toast(View view) {
        Toast.makeText(MainActivity.this , ""+c , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT" , c);
    }
}