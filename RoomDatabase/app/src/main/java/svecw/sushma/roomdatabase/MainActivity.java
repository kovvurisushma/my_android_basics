package svecw.sushma.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText name , email;
Button insert;
TextView tv;
StudentDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.et_mail);
        insert = findViewById(R.id.btn);
        tv = findViewById(R.id.text_view);
        db = Room.databaseBuilder(this, StudentDatabase.class , "apssdc").allowMainThreadQueries().build();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sname = name.getText().toString();
                String emil = email.getText().toString();
                StudentEntity studentEntity = new StudentEntity(sname , emil);
                db.studentDao().insertData(studentEntity);
                Toast.makeText(MainActivity.this , "Insert data" , Toast.LENGTH_SHORT).show();
                getData();

            }
        });

    }
    private  void getData() {
        List<StudentEntity> studentEntities = db.studentDao().getAll();
        for(int i = 0 ; i < studentEntities.size() ; i++) {
            tv.append("" + studentEntities.get(i).getId());
            tv.append("" + studentEntities.get(i).getName());
            tv.append("" + studentEntities.get(i).getEmail());
            tv.append("\n");
        }
    }
}