package com.devislee.ball;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        if(imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Drawable drawable = ((ImageView) v).getDrawable();
                    //AnimatedVectorDrawableCompat实现了Animatable接口
                    Animatable animatable = ((Animatable) drawable);
                    if (animatable.isRunning()) {
                        animatable.stop();
                    }
                    animatable.start();
                }
            });
        }


        ImageView imageView1 = (ImageView) findViewById(R.id.image_view1);
        if(imageView1 != null) {
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Drawable drawable2 = ((ImageView) v).getDrawable();
                    //AnimatedVectorDrawableCompat实现了Animatable接口
                    if (drawable2 instanceof Animatable) {
                        Animatable animatable = ((Animatable) drawable2);
                        if (animatable.isRunning()) {
                            animatable.stop();
                        }
                        animatable.start();
                    }
                }
            });
        }
    }
}
