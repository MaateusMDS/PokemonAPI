package com.pokemon.model.dados;

import com.pokemon.model.Pokemon;

public record ListarPokemon(
    Long id,
    String nome,
    String categoria
) {
    public ListarPokemon(Pokemon pokemon) {
        this (
        pokemon.getId(),
        pokemon.getNome(),
        pokemon.getCategoria().name()
        );
    }
}
