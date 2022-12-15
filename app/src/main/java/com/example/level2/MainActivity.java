package com.example.level2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         RecyclerView rv = findViewById(R.id.rv);

        ArrayList<Fruit> data = new ArrayList<>();
        for(int i=0;i<100;i++){
            Fruit myFruit = new Fruit();
            myFruit.setFruitName("水果"+i);
            myFruit.setFruitPrice((float)i);
            data.add(myFruit);
        }

        Adapter Adapter = new Adapter(data,this);
        rv.setAdapter(Adapter);
        rv.setAdapter(new (this));


    }
}