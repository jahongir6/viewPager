package com.example.viewpagertablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagertablayout.adapter.MyPagerAdapter
import com.example.viewpagertablayout.databinding.ActivityMainBinding
import com.example.viewpagertablayout.models.User
import com.example.viewpagertablayout.utils.DepthPageTransformer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var list =  ArrayList<User>()
    private lateinit var myPagerAdapter: MyPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        myPagerAdapter = MyPagerAdapter(list)
        binding.myViewPager.adapter = myPagerAdapter
        binding.myViewPager.setPageTransformer(true,DepthPageTransformer())

    }

    private fun loadData() {
        list = ArrayList()
        list.add(User(R.drawable.ic_launcher_foreground, "launcher"))
        list.add(User(R.drawable.ic_launcher_background, "salom qale"))
    }
}