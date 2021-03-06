package com.tohsoft.androidjekinex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.app_id)).setText(BuildConfig.APPLICATION_ID + "|" + BuildConfig.BUILD_TYPE + "\n|" +
                BuildConfig.VERSION_CODE + "|" + BuildConfig.VERSION_NAME);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Test jenkins 2");
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("update new feature 2");
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imv);

        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
        findViewById(R.id.btn_theme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("theme feacture!");
            }
        });
    }

    private void showToast(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast(BuildConfig.DEBUG ? "is debug" : " realse");
    }
}

