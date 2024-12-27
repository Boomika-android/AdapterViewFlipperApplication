package com.example.adapterviewflipperapplication;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int [] images = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};
    String [] names = {"Image 1", "Image 2", "Image 3", "Image 4"};
    Adapter adapter;
    AdapterViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        viewFlipper = findViewById(R.id.viewFlipper);
        adapter = new Adapter(this, images, names);
        viewFlipper.setAdapter(adapter);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
    }
}