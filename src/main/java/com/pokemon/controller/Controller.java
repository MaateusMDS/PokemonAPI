package com.pokemon.controller;

import com.pokemon.model.Pokemon;
import com.pokemon.model.dados.InserirPokemon;
import com.pokemon.repository.PokemonRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class Controller {

    @Autowired
    private PokemonRepository repository;

    @PostMapping
    @Transactional
    public void inserirPokemon(@RequestBody @Valid InserirPokemon dados){
        repository.save(new Pokemon(dados));
    }


}
