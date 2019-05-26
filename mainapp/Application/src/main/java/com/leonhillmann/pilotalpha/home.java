package com.leonhillmann.pilotalpha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.android.alphapilotLeonhillmann.CameraActivity;
import com.example.android.camera2video.R;

public class home extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button recordDrive;
        recordDrive = (Button) findViewById(R.id.recorddrive);
        recordDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, CameraActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton settingsbtn;
        settingsbtn = (ImageButton) findViewById(R.id.settingsbtn);
        settingsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, settings.class);
                startActivity(intent);

            }
        });
    }
}
