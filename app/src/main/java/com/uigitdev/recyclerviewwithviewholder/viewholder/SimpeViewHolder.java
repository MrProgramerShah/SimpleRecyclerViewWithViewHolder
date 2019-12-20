package com.uigitdev.recyclerviewwithviewholder.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.recyclerviewwithviewholder.R;

public class SimpeViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout item_parent;
    public TextView item_title;
    public TextView item_subtitle;

    public SimpeViewHolder(@NonNull View itemView) {
        super(itemView);
        item_parent = itemView.findViewById(R.id.item_parent);
        item_title = itemView.findViewById(R.id.item_title);
        item_subtitle = itemView.findViewById(R.id.item_subtitle);
    }
}
