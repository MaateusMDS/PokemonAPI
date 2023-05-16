package com.pokemon.model;

import com.pokemon.model.dados.InserirPokemon;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_POKEMON")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NM_POKEMON")
    private String nome;
    @Column(name = "NUM_ALTURA")
    private double altura;
    @Column(name = "NUM_PESO")
    private double peso;
    @Enumerated(EnumType.STRING)
    @Column(name = "DS_CATEGORIA")
    private Categoria categoria;
    @Column(name = "DS_HABILIDADE")
    private String habilidade;
    @Column(name = "BOL_ATIVO")
    private boolean ativo;

    public Pokemon() {
    }

    public Pokemon(InserirPokemon dados){
        this.nome = dados.nome();
        this.altura = dados.altura();
        this.peso = dados.peso();
        this.categoria = dados.categoria();
        this.habilidade = dados.habilidade();
        this.ativo = true;
    }

    public Pokemon(long id, String nome, double altura, double peso, Categoria categoria, String habilidade) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.habilidade = habilidade;
    }

    public void apagarPokemon(){this.ativo = false;}

    public long getId() {
        return id;
    }

    public Pokemon setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pokemon setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getAltura() {
        return altura;
    }

    public Pokemon setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public double getPeso() {
        return peso;
    }

    public Pokemon setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Pokemon setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public Pokemon setHabilidade(String habilidade) {
        this.habilidade = habilidade;
        return this;
    }
}
