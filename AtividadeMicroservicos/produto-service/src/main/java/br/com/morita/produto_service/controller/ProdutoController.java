package br.com.morita.produto_service.controller;

import br.com.morita.produto_service.model.Produto;
import br.com.morita.produto_service.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(produtoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
        return ResponseEntity.ok().body(produtoService.save(produto));
    }

    @DeleteMapping
    public void remover(@PathVariable Long id){
        produtoService.delete(id);
    }
}
