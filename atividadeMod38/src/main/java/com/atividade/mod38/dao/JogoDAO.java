package com.atividade.mod38.dao;

import com.atividade.mod38.model.Jogo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class JogoDAO {

    @PersistenceContext(unitName = "jogosPU")
    private EntityManager em;

    public void salvar(Jogo jogo) {
        if (jogo.getId() == 0) {
            em.persist(jogo);
        } else {
            em.merge(jogo);
        }
    }

    public void excluir(Jogo jogo) {
        em.remove(em.merge(jogo));
    }

    public Jogo buscarPorId(Long id) {
        return em.find(Jogo.class, id);
    }

    public List<Jogo> listar() {
        return em.createQuery("SELECT j FROM Jogo j", Jogo.class).getResultList();
    }

}
