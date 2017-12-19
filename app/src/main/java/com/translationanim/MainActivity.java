package com.translationanim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View b1 = findViewById(R.id.b1);
        View b2 = findViewById(R.id.b2);

        View textView = findViewById(R.id.text1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hi", Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation localAnimation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.translation);
                localAnimation.setFillAfter(true);
                view.startAnimation(localAnimation);
            }
        });
    }
}
