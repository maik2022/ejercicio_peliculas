package com.example.ejercicio_peliculas.Screen

data class pelicula(val nombre:String, val director:String, val anio:String, val actorPrincipal:String, val link:String) {

    override fun toString(): String {
        return "pelicula(nombre='$nombre', director='$director', año='$anio', actorPrincipal='$actorPrincipal')"
    }
}