package com.example.homeworkmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homeworkmap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val map1 = MapBottomSheetPulo()
    private val map2 = MapBottomSheetAdas()
    private val map3 = MapBottomSheetSrna()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.adas.setOnClickListener{
            map2.show(supportFragmentManager,"MapBottomSheetAdas")
        }
        binding.pulo.setOnClickListener{
            map1.show(supportFragmentManager,"MapBottomSheetPulo")
        }
        binding.srna.setOnClickListener{
            map3.show(supportFragmentManager,"MapBottomSheetSrna")
        }
    }
}