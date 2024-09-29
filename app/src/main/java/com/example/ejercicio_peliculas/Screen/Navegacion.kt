package com.example.ejercicio_peliculas.Screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navegacion(){
    val navController = rememberNavController()
    val pelicula = remember{ mutableStateListOf<pelicula>()}

    NavHost(navController = navController, startDestination = "screen_a")
    {
        composable("screen_a"){
            ScreenA(navController, pelicula)
        }
        composable("screen_b"){
            ScreenB(navController, pelicula)
        }
    }

}

