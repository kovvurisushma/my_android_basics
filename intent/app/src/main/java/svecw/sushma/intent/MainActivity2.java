package svecw.sushma.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.back_btn);
        String st = getIntent().getStringExtra("Hello");
        textView.setText("welcome " + st);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this , MainActivity.class);
                startActivity(i);
            }
        });
    }

}