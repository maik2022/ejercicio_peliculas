package com.example.ejercicio_peliculas.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenA(navController: NavController, peliculaLista: MutableList<pelicula>){

    var nombre by remember { mutableStateOf("") }
    var director by remember { mutableStateOf("") }
    var anio by remember { mutableStateOf("") }
    var actor by remember { mutableStateOf("") }
    var linkImagen by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Black)

    ){
        item {

            Text(
                text = "Agregar Pelicula",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = nombre,
                onValueChange = {nombre = it},
                label = {
                    Text(text = "Nombre")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = director,
                onValueChange = {director = it},
                label = {
                    Text(text = "Director")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = anio,
                onValueChange = {anio = it},
                label = {
                    Text(text = "Año")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = actor,
                onValueChange = {actor = it},
                label = {
                    Text(text = "Actor Principal")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(10.dp))

            TextField(
                value = linkImagen,
                onValueChange = {linkImagen = it},
                label = {
                    Text(text = "URL Imagen")
                },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = {
                if (nombre.isNotBlank() && director.isNotBlank() && anio.isNotBlank() && actor.isNotBlank()) {
                    val nuevaPelicula = pelicula(nombre, director, anio, actor, linkImagen)
                    peliculaLista.add(nuevaPelicula)
                }

                navController.navigate("screen_b")
            },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "Enviar")
            }

        }
    }
}