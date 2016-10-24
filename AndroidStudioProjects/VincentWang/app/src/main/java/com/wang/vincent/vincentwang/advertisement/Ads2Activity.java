package com.wang.vincent.vincentwang.advertisement;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.wang.vincent.vincentwang.R;

public class Ads2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ads2);

        new CountDownTimer(2000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                // TODO Auto-generated method stub

            }
            @Override
            public void onFinish() {    //倒计时结束后在这里实现activity跳转
                Intent intent = new Intent();
                intent.setClass(Ads2Activity.this, Ads3Activity.class);
                startActivity(intent);
                finish();                  //跳转后销毁自身的activity  否则按返回 还会跳回到图片
            }
        }.start();
    }
}
