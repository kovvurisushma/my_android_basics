package svecw.sushma.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rc_v);
        int image[] = {R.drawable.alpha , R.drawable.beta , R.drawable.cupcake , R.drawable.donut ,
                       R.drawable.eclair , R.drawable.froyo , R.drawable.gingerbread , R.drawable.honeycomb ,
                       R.drawable.icecreamsandwich , R.drawable.jellybean , R.drawable.kitkat ,
                       R.drawable.lollipop , R.drawable.marshmallow , R.drawable.nougat ,
                       R.drawable.oreo , R.drawable.pie , R.drawable.q , R.drawable.r};

        String data[] = {"alpha" , "beta" , "cupcake" , "donut" , "eclair" , "froyo" ,
                         "gingerbread" , "honeycomb" , "icecreamsandwich" , "jellybean" ,
                          "kitkat" , "lollipop" , "marshmallow" , "nougat" , "oreo" , "pie" , "q" , "r"};

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this , image , data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}