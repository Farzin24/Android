package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button clickButton;
    private boolean isFirstImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        clickButton = findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleImage();
            }
        });
    }

    /**
     * Toggles the image displayed in the ImageView.
     * Switches between two predefined images when called.
     */
    private void toggleImage() {
        if (isFirstImage) {
            imageView.setImageResource(R.drawable.second_image);
        } else {
            imageView.setImageResource(R.drawable.first_image);
        }
        isFirstImage = !isFirstImage;
    }
}