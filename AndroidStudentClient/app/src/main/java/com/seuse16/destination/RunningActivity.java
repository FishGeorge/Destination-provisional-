package com.seuse16.destination;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RunningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
        // 元件注册
        TextView Distance = findViewById(R.id.runningdistance);
        TextView TimepKm = findViewById(R.id.timepkm);
        TextView Time = findViewById(R.id.totaltime);
        TextView Cost = findViewById(R.id.calorie);
        final Button btn_pause = findViewById(R.id.btn_pause);
        final Button btn_continue = findViewById(R.id.btn_continue);
        final Button btn_finish = findViewById(R.id.btn_finish);
        // pause button
        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 此处调用暂停函数

                // 使暂停按钮不可见
                btn_pause.setVisibility(View.INVISIBLE);
                // 使结束和继续按钮可见
                btn_continue.setVisibility(View.VISIBLE);
                btn_finish.setVisibility(View.VISIBLE);
            }
        });
        // continue button
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 此处调用继续函数

                // 使结束和继续按钮不可见
                btn_continue.setVisibility(View.INVISIBLE);
                btn_finish.setVisibility(View.INVISIBLE);
                // 使暂停按钮可见
                btn_pause.setVisibility(View.VISIBLE);
            }
        });
        // finish button
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 此处调用结束函数

                // 退出activity
                finish();
            }
        });
    }
}