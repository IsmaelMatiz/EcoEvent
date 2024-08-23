package com.training.retojhonf.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.training.retojhonf.R;

import java.util.List;

public class RecyclingAdapter extends RecyclerView.Adapter<RecyclingAdapter.ViewHolder> {
    private List<RecyclingType> recyclingTypes;
    private Context context;

    public RecyclingAdapter(List<RecyclingType> recyclingTypes, Context context) {
        this.recyclingTypes = recyclingTypes;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycling, parent, false);
        //return new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RecyclingType recyclingType = recyclingTypes.get(position);
        //holder.nameTextView.setText(recyclingType.getName());
        //holder.descriptionTextView.setText(recyclingType.getDescription());
        //holder.imageView.setImageResource(recyclingType.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return recyclingTypes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView descriptionTextView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}
