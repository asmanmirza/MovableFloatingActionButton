package com.asmanmirza.fabApp

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.asmanmirza.fabApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            fab.setOnClickListener {
                val animShake = AnimationUtils.loadAnimation(this@MainActivity, R.anim.shake)
                it.startAnimation(animShake)
            }
        }
    }
}
