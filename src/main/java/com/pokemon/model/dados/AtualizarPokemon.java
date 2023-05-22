package com.pokemon.model.dados;

import com.pokemon.model.Categoria;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;

public record AtualizarPokemon(
        String nome,
        @DecimalMin("0.4") @DecimalMax(value = "10.0", inclusive = false)
        double altura,
        @Digits(integer=3, fraction=1)
        double peso,
        Categoria categoria,
        String habilidade
) {
}
