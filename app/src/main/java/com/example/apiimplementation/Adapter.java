package com.example.apiimplementation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.CustomViewHolder> {

    private List<PostPojo> datalist;
    private Context context;

    public Adapter(Context context, List<PostPojo> datalist) {
        this.context = context;
        this.datalist = datalist;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView titles, posts;

        CustomViewHolder(View itemview) {
            super(itemview);
            //findviewbyid titles post
            titles = itemview.findViewById(R.id.title);
            posts = itemview.findViewById(R.id.body);

        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.design,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder,int position){
        holder.titles.setText(datalist.get(position).getTitle());
        holder.posts.setText(datalist.get(position).getBody());

    }

    @Override
    public int getItemCount(){return datalist.size();}






}
