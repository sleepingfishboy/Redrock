package com.example.level2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThreeGStoryActivity extends AppCompatActivity {
    private Button mBtn3G;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threeg);
        mBtn3G = findViewById(R.id.btn_3G);
        mBtn3G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThreeGStoryActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}