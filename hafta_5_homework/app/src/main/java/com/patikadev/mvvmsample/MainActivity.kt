package com.patikadev.mvvmsample

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.tabs.TabLayoutMediator
import com.pakt_games.myapplication.viewpager.MainViewPagerAdapter
import com.patikadev.mvvmsample.database.MovieDatabase
import com.patikadev.mvvmsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
     //   setSupportActionBar(binding.toolbar)
    //    val navController = findNavController(R.id.nav_host_fragment_content_main)
    //    appBarConfiguration = AppBarConfiguration(navController.graph)
    //    setupActionBarWithNavController(navController, appBarConfiguration)







    }

}