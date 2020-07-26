package svecw.sushma.options;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.row, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this,"Setting option" , Toast.LENGTH_SHORT);
                break;
            case R.id.about:
                Toast.makeText(this,"about " , Toast.LENGTH_SHORT);
                break;
            case R.id.help:
                Toast.makeText(this,"help  option" , Toast.LENGTH_SHORT);
                break;
            case R.id.status:
                Toast.makeText(this,"Status option" , Toast.LENGTH_SHORT);
                break;
            case R.id.info:
                Toast.makeText(this,"info option" , Toast.LENGTH_SHORT);
                break;
            case R.id.home:
                Toast.makeText(this,"home option" , Toast.LENGTH_SHORT);
                break;
            case R.id.logout:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Do you want to exxitt");
                builder.setMessage("ARre Youuu Sure");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
        }

        return super.onOptionsItemSelected(item);
    }
}