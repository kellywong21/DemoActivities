package sg.edu.rp.c346.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivites2 extends AppCompatActivity {
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activites2);
        tvText = findViewById(R.id.tvText);
        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        tvText.setText("You are " + info[0] +", age " + info[1]);
    }
}
