package com.example.day3listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList arrayList;

    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);

        arrayList = new ArrayList();

        arrayList.add("Name1");
        arrayList.add("Name2");
        arrayList.add("Name3");
        arrayList.add("Name4");
        arrayList.add("Name5");
        arrayList.add("Name6");
        arrayList.add("Name7");
        arrayList.add("Name8");
        arrayList.add("Name9");
        arrayList.add("Name10");
        arrayList.add("Name11");
        arrayList.add("Name12");
        arrayList.add("Name13");
        arrayList.add("Name14");
        arrayList.add("Name15");
        arrayList.add("Name16");
        arrayList.add("Name17");
        arrayList.add("Name18");
        arrayList.add("Name19");
        arrayList.add("Name20");
        arrayList.add("Name21");
        arrayList.add("Name22");
        arrayList.add("Name23");
        arrayList.add("Name24");
        arrayList.add("Name25");
        arrayList.add("Name26");
        arrayList.add("Name27");
        arrayList.add("Name28");
        arrayList.add("Name29");
        arrayList.add("Name30");
        arrayList.add("Name31");
        arrayList.add("Name32");


        arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        lv.setAdapter(arrayAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String s;

                s = arrayList.get(position).toString();

                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();


            }
        });

    }
}