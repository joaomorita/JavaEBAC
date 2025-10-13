package com.atividade.mod38.service;

import com.atividade.mod38.dao.JogoDAO;
import com.atividade.mod38.model.Jogo;
import jakarta.inject.Inject;

import java.util.List;

public class JogoService {

    @Inject
    private JogoDAO jogoDAO;

    public void salvar(Jogo jogo) {
        jogoDAO.salvar(jogo);
    }

    public void excluir(Jogo jogo) {
        jogoDAO.excluir(jogo);
    }

    public List<Jogo> listar() {
        return jogoDAO.listar();
    }
}
