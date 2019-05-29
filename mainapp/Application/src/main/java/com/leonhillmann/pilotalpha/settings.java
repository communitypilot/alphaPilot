package com.leonhillmann.pilotalpha;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.view.View;
import android.widget.Button;

import com.example.android.alphapilotLeonhillmann.CameraActivity;
import com.example.android.camera2video.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button signout;
        signout = (Button) findViewById(R.id.signout);
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                FirebaseAuth.getInstance().signOut();

                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(com.leonhillmann.pilotalpha.settings.this, com.leonhillmann.pilotalpha.loginUI.class);
                startActivity(intent);
                finish();

            }
        });
    }

}


