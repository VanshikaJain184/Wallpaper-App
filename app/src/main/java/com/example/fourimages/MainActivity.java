package com.example.fourimages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<Model> arr = new ArrayList<Model>();

        arr.add(new Model(R.drawable.img1));
        arr.add(new Model(R.drawable.img2));
        arr.add(new Model(R.drawable.img3));
        arr.add(new Model(R.drawable.img4));
        arr.add(new Model(R.drawable.img5));
        arr.add(new Model(R.drawable.img6));
        arr.add(new Model(R.drawable.img7));
        arr.add(new Model(R.drawable.img8));
        arr.add(new Model(R.drawable.img9));
        arr.add(new Model(R.drawable.img10));
        arr.add(new Model(R.drawable.img11));
        arr.add(new Model(R.drawable.img12));
        arr.add(new Model(R.drawable.img13));
        arr.add(new Model(R.drawable.img14));
        arr.add(new Model(R.drawable.img15));

        CustomAdapter c=new CustomAdapter(arr,this);

        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(c);

    }

}