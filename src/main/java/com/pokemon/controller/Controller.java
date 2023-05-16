package com.pokemon.controller;

import com.pokemon.model.Pokemon;
import com.pokemon.model.dados.InserirPokemon;
import com.pokemon.model.dados.ListarPokemon;
import com.pokemon.repository.PokemonRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<ListarPokemon> findAll(@PageableDefault(size = 3, sort = {"nome"}) Pageable pageable) {
        return repository.findAllByAtivoTrue(pageable).map(ListarPokemon::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void removerPokemon(@PathVariable Long id){
        var pokemon = new Pokemon();
        pokemon = repository.getReferenceById(id);
        pokemon.apagarPokemon();
    }


}
