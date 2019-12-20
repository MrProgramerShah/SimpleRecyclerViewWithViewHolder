package com.uigitdev.recyclerviewwithviewholder;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.recyclerviewwithviewholder.adapter.SimpleRecyclerViewAdapter;
import com.uigitdev.recyclerviewwithviewholder.model.SimpleModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<SimpleModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        arrayList = new ArrayList<>();
        arrayList.add(new SimpleModel("Item title 0", "Item subtitle 0"));
        arrayList.add(new SimpleModel("Item title 1", "Item subtitle 1"));
        arrayList.add(new SimpleModel("Item title 2", "Item subtitle 2"));
        arrayList.add(new SimpleModel("Item title 3", "Item subtitle 3"));
        arrayList.add(new SimpleModel("Item title 4", "Item subtitle 4"));
        
        setAdapter();
    }

    private void setAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        SimpleRecyclerViewAdapter adapter = new SimpleRecyclerViewAdapter(arrayList, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}
