package com.example.parcialpokemon2.data

import com.example.parcialpokemon2.data.model.PokemonModel

//model 01
const val name = "Bulbasur"
const val type = "Grass"
const val description = "Un pokemon que nadie elije"
const val noPokedex = 1

//model 02
const val name2 = "Pikachu"
const val type2 = "Electric"
const val description2 = "Un pokemon bien genial."
const val noPokedex2 = 25

var pokemons = mutableListOf(
    PokemonModel(name, type, description, noPokedex),
    PokemonModel(name2, type, description2, noPokedex2),
)