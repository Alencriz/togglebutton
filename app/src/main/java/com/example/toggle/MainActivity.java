package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ToggleButton wf, bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wf = findViewById(R.id.wifibtn);
        bt = findViewById(R.id.bluebtn);
    }

    public void showstatus(View view) {
        String status = "";

        if (wf.isChecked()) {
            status = "WiFi is ON";
        } else {
            status = "WiFi is OFF";
        }

        if (bt.isChecked()) {
            status += "\n Bluetooth is ON";
        } else {
            status += "\n Bluetooth is OFF";
        }

        Toast.makeText(this, status, Toast.LENGTH_LONG).show();
    }
}
