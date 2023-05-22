package com.pokemon.model.dados;

import com.pokemon.model.Categoria;
import jakarta.validation.constraints.*;

public record InserirPokemon(
        @NotBlank
        String nome,
        @NotNull @DecimalMin("0.4") @DecimalMax(value = "10.0", inclusive = false)
        double altura,
        @NotNull @Digits(integer=3, fraction=1)
        double peso,
        @NotNull
        Categoria categoria,
        String habilidade
) {
}
