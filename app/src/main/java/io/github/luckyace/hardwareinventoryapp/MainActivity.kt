package io.github.luckyace.hardwareinventoryapp

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab.setOnClickListener {
            val intent = Intent(MainActivity@this, ScanActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity@this,
                    fab, "fab_transition")
            startActivity(intent, options.toBundle())
        }
    }
}
