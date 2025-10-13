package com.atividade.mod38.controller;

import com.atividade.mod38.model.Jogo;
import com.atividade.mod38.service.JogoService;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

import java.util.List;

public class JogoController {

    private Jogo jogo = new Jogo();

    private List<Jogo> jogos;

    @Inject
    private JogoService jogoService;

    @PostConstruct
    public void init() {
        jogos = jogoService.listar();
    }

    public void salvar() {
        jogoService.salvar(jogo);
        jogos = jogoService.listar();
        jogo = new Jogo();
    }

    public void editar(Jogo j) {
        this.jogo = j;
    }

    public void excluir(Jogo j) {
        jogoService.excluir(j);
        jogos = jogoService.listar();
    }

    public JogoService getJogoService() {
        return jogoService;
    }

    public void setJogoService(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
