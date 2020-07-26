package svecw.sushma.menuand;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.nio.file.FileVisitOption;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
Button _date , time;
TextView textView;
int day,month,year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _date = findViewById(R.id.bt_date);
        time = findViewById(R.id.bt_time);
        textView = findViewById(R.id.tv);

        _date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DAY_OF_MONTH);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int i1, int i2) {

                            String dt = year + "_" + i1 + "_" + i2;
                            textView.setText(dt);
                        }
                        }, year , month , day);
            }
                });


        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}