package com.example.ejercicio_peliculas.Screen

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.ejercicio_peliculas.R


@Composable
fun ScreenB(navController: NavController, pelicula: List<pelicula>){

    val pelicula1 = pelicula("Interception", "Christopher Nolan", "2010", "Leonardo DiCaprio", "link")
    val pelicula2 = pelicula("Pulp Fiction", "Quenti Tarantino", "1994", "John Travolta", "link")
    val pelicula3 = pelicula("The Dark Knight", "Christopher Nolan", "2008", "Christian Bale", "link")
    val pelicula4 = pelicula("The GodFather", "Francis Ford Coppola", "1972", "Marlon Brando", "link")
    val pelicula5 = pelicula("The Shawshank Redemption", "Frank Darabont", "1994", "Tim Robbins", "link")

    var check_1 by remember { mutableStateOf(false)}
    var check_2 by remember { mutableStateOf(false)}
    var check_3 by remember { mutableStateOf(false)}
    var check_4 by remember { mutableStateOf(false)}
    var check_5 by remember { mutableStateOf(false)}

    val expanded1 = remember { mutableStateOf(false) }
    val expanded2 = remember { mutableStateOf(false) }
    val expanded3 = remember { mutableStateOf(false) }
    val expanded4 = remember { mutableStateOf(false) }
    val expanded5 = remember { mutableStateOf(false) }

    val estadoCheck = remember { mutableStateListOf<Boolean>().apply {
        addAll(List(pelicula.size) {false})
    }}

    val estadoExpanded = remember { mutableStateListOf<Boolean>().apply {
        addAll(List(pelicula.size) {false})
    }}

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Black)

    ) {
        item {

            Text(
                text = "Lista de Peliculas",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )



            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { expanded1.value = !expanded1.value }
                    .animateContentSize(),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Text(
                    text = "Nombre: ${pelicula1.nombre}\n" +
                            "Director: ${pelicula1.director}\n" +
                            "Año: ${pelicula1.anio}\n" +
                            "Actor Principal: ${pelicula1.actorPrincipal}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )

                if (expanded1.value) {
                    Image(
                        painter = painterResource(id = R.drawable.pelicula_1),
                        contentDescription = "Pelicula 1",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .height(100.dp)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Checkbox(
                            checked = check_1,
                            onCheckedChange = { check_1 = it},
                            modifier = Modifier
                                .size(32.dp)
                                .fillMaxWidth(),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.Green,
                                uncheckedColor = Color.Red,
                                checkmarkColor = Color.Black
                            )
                        )

                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Vista",
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),

                            )

                    }
                }
            }

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { expanded2.value = !expanded2.value }
                    .animateContentSize(),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Text(
                    text = "Nombre: ${pelicula2.nombre}\n" +
                            "Director: ${pelicula2.director}\n" +
                            "Año: ${pelicula2.anio}\n" +
                            "Actor Principal: ${pelicula2.actorPrincipal}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )

                if (expanded2.value) {
                    Image(
                        painter = painterResource(id = R.drawable.pelicula_2),
                        contentDescription = "Pelicula 2",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .height(100.dp)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Checkbox(
                            checked = check_2,
                            onCheckedChange = { check_2 = it},
                            modifier = Modifier
                                .size(32.dp)
                                .fillMaxWidth(),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.Green,
                                uncheckedColor = Color.Red,
                                checkmarkColor = Color.Black
                            )
                        )

                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Vista",
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),

                            )

                    }
                }
            }

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { expanded3.value = !expanded3.value }
                    .animateContentSize(),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Text(
                    text = "Nombre: ${pelicula3.nombre}\n" +
                            "Director: ${pelicula3.director}\n" +
                            "Año: ${pelicula3.anio}\n" +
                            "Actor Principal: ${pelicula3.actorPrincipal}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )

                if (expanded3.value) {
                    Image(
                        painter = painterResource(id = R.drawable.pelicula_3),
                        contentDescription = "Pelicula 3",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .height(100.dp)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Checkbox(
                            checked = check_3,
                            onCheckedChange = { check_3 = it},
                            modifier = Modifier
                                .size(32.dp)
                                .fillMaxWidth(),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.Green,
                                uncheckedColor = Color.Red,
                                checkmarkColor = Color.Black
                            )
                        )

                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Vista",
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),

                            )

                    }
                }
            }

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clickable { expanded4.value = !expanded4.value }
                    .animateContentSize(),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Text(
                    text = "Nombre: ${pelicula4.nombre}\n" +
                            "Director: ${pelicula4.director}\n" +
                            "Año: ${pelicula4.anio}\n" +
                            "Actor Principal: ${pelicula4.actorPrincipal}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )

                if (expanded4.value) {
                    Image(
                        painter = painterResource(id = R.drawable.pelicula_4),
                        contentDescription = "Pelicula 4",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .height(100.dp)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Checkbox(
                            checked = check_4,
                            onCheckedChange = { check_4 = it},
                            modifier = Modifier
                                .size(32.dp)
                                .fillMaxWidth(),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.Green,
                                uncheckedColor = Color.Red,
                                checkmarkColor = Color.Black
                            )
                        )

                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Vista",
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),

                            )
                    }
                }

            }

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Text(
                    text = "Nombre: ${pelicula5.nombre}\n" +
                            "Director: ${pelicula5.director}\n" +
                            "Año: ${pelicula5.anio}\n" +
                            "Actor Principal: ${pelicula5.actorPrincipal}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .clickable { expanded5.value = !expanded5.value }
                        .animateContentSize(),
                    textAlign = TextAlign.Center
                )

                if (expanded5.value) {
                    Image(
                        painter = painterResource(id = R.drawable.pelicula_5),
                        contentDescription = "Pelicula 5",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                            .height(100.dp)
                    )

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Checkbox(
                            checked = check_5,
                            onCheckedChange = { check_5 = it},
                            modifier = Modifier
                                .size(32.dp)
                                .fillMaxWidth(),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color.Green,
                                uncheckedColor = Color.Red,
                                checkmarkColor = Color.Black
                            )
                        )

                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Vista",
                            modifier = Modifier
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),

                            )
                    }
                }
            }

            pelicula.forEachIndexed { index, peli ->

                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clickable { estadoExpanded[index] = !estadoExpanded[index] }
                        .animateContentSize(),
                    elevation = CardDefaults.cardElevation(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ){
                    Text(
                        text = "Nombre: ${peli.nombre}\n" +
                                "Director: ${peli.director}\n" +
                                "Año: ${peli.anio}\n" +
                                "Actor Principal: ${peli.actorPrincipal}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        textAlign = TextAlign.Center
                    )

                    if (estadoExpanded[index]) {
                        AsyncImage(
                            model = peli.link,
                            contentDescription = "Imagen",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 10.dp)
                                .height(100.dp)
                        )

                        Row (
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Checkbox(
                                checked = estadoCheck[index],
                                onCheckedChange = { estadoCheck[index] = it},
                                modifier = Modifier
                                    .size(32.dp)
                                    .fillMaxWidth(),
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color.Green,
                                    uncheckedColor = Color.Red,
                                    checkmarkColor = Color.Black
                                )
                            )

                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "Vista",
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .align(Alignment.CenterVertically),

                                )
                        }

                    }
                }
            }

            Button(onClick = {

                navController.popBackStack()

            },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "Atrás")
            }


        }
    }
}

