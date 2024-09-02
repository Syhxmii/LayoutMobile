package com.example.layoutingmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            View btnLinear = findViewById(R.id.linearBtn);
            View btnRelative = findViewById(R.id.relativeBtn);
            View btnConstraint = findViewById(R.id.constraintLayout);
            View btnFrame = findViewById(R.id.FrameBtn);
            View btnTable = findViewById(R.id.TableBtn);
            View btnMaterial = findViewById(R.id.materialBtn);
            View btnScroll = findViewById(R.id.ScrollBtn);
            View btnScrollHoriz = findViewById(R.id.ScrollHorizobtalBtn);

            btnConstraint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, constraintlayout.class));
                }
            });

            btnLinear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, linearlayout.class));
                }
            });

            btnRelative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, relativelayout.class));
                }
            });

            btnFrame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, framelayout.class));
                }
            });

            btnTable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, tablelayout.class));
                }
            });

            btnMaterial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, materialdesign.class));
                }
            });

            btnScroll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, scrollview.class));
                }
            });

            btnScrollHoriz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, scrollviewhorizontal.class));
                }
            });
        }
    }