package sg.edu.rp.c346.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        btnDone = findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] info = {etName.getText().toString(),etAge.getText().toString()};

                Intent i = new Intent(MainActivity.this,DemoActivites2.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });


    }
}
