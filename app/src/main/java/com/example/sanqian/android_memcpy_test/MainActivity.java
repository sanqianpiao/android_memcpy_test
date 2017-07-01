package com.example.sanqian.android_memcpy_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.sanqian.android_memcpy_test.ByteUtil.getMsgFromJni;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.jni_msgView)).setText(getMsgFromJni());
    }


}
