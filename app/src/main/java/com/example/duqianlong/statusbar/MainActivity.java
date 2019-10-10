package com.example.duqianlong.statusbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置状态栏颜色
        StatusBarUtils.setColor(this, getResources().getColor(R.color.backgroundcolor)); //backgroundcolor:activity背景颜色
        //解决当状态栏背景太亮或太浅的时候 看不清状态栏字体，，，默认：true
        StatusBarUtils.setTextDark(this,true);
        //当背景是图片时，把图片顶到状态栏
        StatusBarUtils.setTransparent(this);
      }
}
