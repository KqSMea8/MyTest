package com.example.liuwei.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import Activitys.ListActivity;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

    }

    @Override
    protected String[] getData() {
        String[] data = {"java", "android", "数据结构", "算法", "设计模式", "3D引擎"};
        return data;
    }
}
