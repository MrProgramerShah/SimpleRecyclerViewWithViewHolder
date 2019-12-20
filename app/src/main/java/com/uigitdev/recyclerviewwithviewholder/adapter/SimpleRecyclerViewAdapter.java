package com.uigitdev.recyclerviewwithviewholder.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.recyclerviewwithviewholder.R;
import com.uigitdev.recyclerviewwithviewholder.model.SimpleModel;
import com.uigitdev.recyclerviewwithviewholder.viewholder.SimpeViewHolder;

import java.util.ArrayList;

public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<SimpleModel> arrayList;
    private Context context;

    public SimpleRecyclerViewAdapter(ArrayList<SimpleModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item, parent, false);
        return new SimpeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setTitle(((SimpeViewHolder)holder).item_title, arrayList.get(position).getTitle());
        setSubtitle(((SimpeViewHolder)holder).item_subtitle, arrayList.get(position).getSubTitle());
        setOnClick(((SimpeViewHolder)holder).item_parent, position, arrayList.get(position).getTitle(), arrayList.get(position).getSubTitle());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //-----------------------------------------------------

    private void setTitle(TextView textView, String title){
        textView.setText(title);
    }

    private void setSubtitle(TextView textView, String subtitle){
        textView.setText(subtitle);
    }

    private void setOnClick(RelativeLayout parent, final int position, final String title, final String subtitle){
        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click: " + position + " " + title + " " + subtitle, Toast.LENGTH_LONG).show();
            }
        });
    }
}
