package ru.kheynov.crosswordle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.kheynov.crosswordle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.appComponent
            .mainActivityComponent()
            .create()
            .inject(this)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
