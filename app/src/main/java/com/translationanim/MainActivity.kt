package com.translationanim

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<View>(R.id.b1)
        val b2 = findViewById<View>(R.id.b2)
        val b3 = findViewById<View>(R.id.b3)

        val textView = findViewById<View>(R.id.text1)

        textView.setOnClickListener { Toast.makeText(baseContext, "Hi", Toast.LENGTH_LONG).show() }

        b1.setOnClickListener { _ ->
            val localAnimation = AnimationUtils.loadAnimation(baseContext, R.anim.translation)
            localAnimation.fillAfter = true
            textView.startAnimation(localAnimation)
        }

        b2.setOnClickListener { _ ->
            textView.animate().translationY(174f).duration = 3000
        }

        b3.setOnClickListener { _ ->
            val transAnimation = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, 174f)
            transAnimation.duration = 3000
            transAnimation.start()
        }
    }
}
