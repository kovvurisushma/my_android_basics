package svecw.sushma.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity" , "onStart() is executing");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity" , "onResume() is executing");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity" , "onPause() is executing");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity" , "onDestroy() is executing");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity" , "onStop() is executing");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity" , "onRestart() is executing");
    }
    
}