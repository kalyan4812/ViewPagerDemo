package com.saikalyandaroju.viewpagerdemo.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.saikalyandaroju.viewpagerdemo.R;
import com.saikalyandaroju.viewpagerdemo.SecondaryActivity;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private int[] colors = {
            android.R.color.black,
            android.R.color.holo_red_light,
            android.R.color.holo_blue_dark,
            android.R.color.holo_purple};

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.title.setText("page" + (position + 1));
        holder.about.setText("Viewpager" + (position + 1));
        holder.imageView.setImageResource(R.drawable.ic_launcher_background);
        holder.constraintLayout.setBackgroundResource(colors[position]);
        if (position == colors.length - 1) {
            holder.next.setVisibility(View.VISIBLE);
            holder.next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), SecondaryActivity.class));
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return colors.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout constraintLayout;
        TextView title, about;
        ImageView imageView;
        Button next;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvTitle);
            about = itemView.findViewById(R.id.tvAbout);
            imageView = itemView.findViewById(R.id.ivImage);
            constraintLayout = itemView.findViewById(R.id.container);
            next = itemView.findViewById(R.id.button);
        }
    }

}
