package com.pokemon.model.dados;

import com.pokemon.model.Categoria;

public record InserirPokemon(
        String nome,
        double altura,
        double peso,
        Categoria categoria,
        String habilidade
) {
}
