package com.example.administrator.smartplug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //使用activity_main_xml文件定义界面布局
        setContentView(R.layout.activity_main);

        LinearLayout root = (LinearLayout) findViewById(R.id.root);

        //创建DrawView组件
        final DrawView draw = new DrawView(this);
        //自定义小球最小宽度和高度
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);
    }
    public void clickHandler(View source){
        //获取UI界面中的ID为R.id.show文本框
        TextView tv = (TextView) findViewById(R.id.show);
        //改变文本框内容
        tv.setText("Hello Android   " + new java.util.Date());
    }

}
