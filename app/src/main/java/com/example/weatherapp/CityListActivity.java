package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CityListActivity extends AppCompatActivity {

    private ArrayAdapter cityAdapter;
    private ArrayList cityList;

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);
        ListView listView = findViewById(R.id.idCityList);
        Bundle arguments = getIntent().getExtras();
        cityList = (ArrayList) arguments.getStringArrayList("list");
        cityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cityList);


        listView.setAdapter(cityAdapter);
        cityAdapter.notifyDataSetChanged();
    }


}