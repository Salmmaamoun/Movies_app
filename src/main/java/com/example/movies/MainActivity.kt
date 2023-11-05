package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.movies.databinding.ActivityMainBinding
import com.example.movies.ui.Home.HomeFragment

class MainActivity :AppCompatActivity(){
    private lateinit var navController: NavController
    private lateinit var binding :ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
       binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        navController = Navigation.findNavController(this, R.id.container)
        binding.btmNav.setupWithNavController(navController)
    }
}





/*
https://api.themoviedb.org/3/genre/movie/list?api_key=e22c84143c2625340079f906716fd3a9--category
https://api.themoviedb.org/3/movie/now_playing?api_key=e22c84143c2625340079f906716fd3a9https://api.themoviedb.org/3/movie/now_playing?api_key=e22c84143c2625340079f906716fd3a9----release
https://api.themoviedb.org/3/movie/22/recommendations?api_key=e22c84143c2625340079f906716fd3a9---recomandation
 */