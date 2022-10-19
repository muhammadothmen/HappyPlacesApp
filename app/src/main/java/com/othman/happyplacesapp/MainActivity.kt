package com.othman.happyplacesapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.othman.happyplacesapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        fabAddHappyPlace.setOnClickListener {
            val intent = Intent(this@MainActivity,AddHappyPlaceActivity::class.java)
            startActivity(intent)
        }



    }
}