package com.example.fourimages;



import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    ArrayList <Model> localDataSet;
   Context context;
    public class ViewHolder extends RecyclerView.ViewHolder {

         ImageView imageView;

        public ViewHolder(@NonNull View view) {
            super(view);

            imageView=(ImageView) view.findViewById(R.id.imageView);

        }


//        public ImageView getImageView() {
//            return imageView;
//        }

    }


    public CustomAdapter(ArrayList <Model> localDataSet,Context context) {

        this.localDataSet = localDataSet;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

      Model model=localDataSet.get(position);
      viewHolder.imageView.setImageResource(model.getImage());
   //viewHolder.imageView.setImageResource(localDataSet.get(position).getImage());
    //((ViewHolder)viewHolder).imageView.setImageResource(data.getImage());

        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,SetWallpaper.class);
              //  Intent.putExtra("imagename",model.getImage());
              //  Intent.putExtra("imageName",model.getImage());
              intent.putExtra("imagename", model.getImage());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return localDataSet.size();
    }


}
