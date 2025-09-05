package br.com.morita;
import br.com.morita.dao.IProdutoDAO;
import br.com.morita.dao.ProdutoDAO;
import br.com.morita.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProdutoTest {

    @Test
    public void cadastrarProdTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto prod = new Produto();
        prod.setCodigoProd("01");
        prod.setNomeProd("TV");
        prod.setDescricaoProd("TV 42 polegadas");

        Integer qtd = dao.cadastrar(prod);

        Assert.assertTrue(qtd == 1);

        Produto prodDB = dao.consultar(prod.getCodigoProd());
        Assert.assertNotNull(prodDB);
        Assert.assertNotNull(prodDB.getId());
        Assert.assertEquals(prod.getCodigoProd(), prodDB.getCodigoProd());
        Assert.assertEquals(prod.getNomeProd(), prodDB.getNomeProd());

        Integer qtdDel = dao.excluir(prodDB);
        Assert.assertNotNull(qtdDel == 1);

    }

    @Test
    public void consultarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();
        Produto produto = new Produto();

        produto.setCodigoProd("01");
        produto.setNomeProd("TV");
        produto.setDescricaoProd("TV 42 polegadas");

        // salva o produto no banco dentro de uma variável
        Integer qtde = dao.cadastrar(produto);

        // verifica se existe uma entrada no banco
        Assert.assertTrue(qtde == 1);

        Produto produtoDB = dao.consultar("01");
        Assert.assertNotNull(produtoDB);
        Assert.assertEquals(produto.getCodigoProd(), produtoDB.getCodigoProd());
        Assert.assertEquals(produto.getNomeProd(), produtoDB.getNomeProd());

        // deleta do banco
        Integer qtdDel = dao.excluir(produtoDB);

        // confere se foi deletado
        Assert.assertTrue(qtdDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {

        // cria instancia do dao
        IProdutoDAO dao = new ProdutoDAO();

        // Cria o produto
        Produto produto = new Produto();
        produto.setCodigoProd("01");
        produto.setNomeProd("TV");
        produto.setDescricaoProd("TV 42 polegadas");
        Integer qtd = dao.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        // Compara com produto do banco
        Produto produtoDB = dao.consultar("01");
        Assert.assertNotNull(produtoDB);
        Assert.assertEquals(produto.getCodigoProd(), produtoDB.getCodigoProd());
        Assert.assertEquals(produto.getNomeProd(), produtoDB.getNomeProd());
        Assert.assertEquals(produto.getDescricaoProd(), produtoDB.getDescricaoProd());

        // Deleta do banco
        Integer qtdDel = dao.excluir(produto);
        Assert.assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception{
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigoProd("01");
        produto.setNomeProd("TV");
        produto.setDescricaoProd("TV 42 polegadas");
        Integer qtd = dao.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produto1 = new Produto();
        produto1.setCodigoProd("02");
        produto1.setNomeProd("TV SAMSUNG");
        produto1.setDescricaoProd("TV 52 polegadas");
        Integer qtd2 = dao.cadastrar(produto1);
        Assert.assertTrue(qtd2 == 1);

        List<Produto> listaProdutos = dao.buscarTodos();
        Assert.assertNotNull(listaProdutos);
        Assert.assertTrue(listaProdutos.size() == 2);

        int contador = 0;
        for (Produto prod : listaProdutos) {
            dao.excluir(prod);
            contador++;
        }

        Assert.assertEquals(contador, 2);

        listaProdutos = dao.buscarTodos();
        Assert.assertEquals(listaProdutos.size(), 0);
    }

    @Test
    public void atualizaProdutoTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();

        produto.setCodigoProd("01");
        produto.setNomeProd("TV");
        produto.setDescricaoProd("TV 42 polegadas");
        Integer qtd = dao.cadastrar(produto);

        Assert.assertTrue(qtd == 1);

        Produto produtoAtualizado = dao.consultar("01");
        Assert.assertNotNull(produtoAtualizado);
        Assert.assertEquals(produto.getCodigoProd(), produtoAtualizado.getCodigoProd());
        Assert.assertEquals(produto.getNomeProd(), produtoAtualizado.getNomeProd());
        Assert.assertEquals(produto.getDescricaoProd(), produtoAtualizado.getDescricaoProd());

        produtoAtualizado.setCodigoProd("02");
        produtoAtualizado.setNomeProd("TV Atualizado");
        produtoAtualizado.setDescricaoProd("TV ATUALIZADA");
        Integer contadorUpd = dao.atualizar(produtoAtualizado);
        Assert.assertTrue(contadorUpd == 1);

        Produto prodDB2 = dao.consultar("01");
        Assert.assertNull(prodDB2);

        Produto prodDB3 = dao.consultar("02");
        Assert.assertNotNull(prodDB3);
        Assert.assertEquals(produtoAtualizado.getId(), prodDB3.getId());
        Assert.assertEquals(produtoAtualizado.getCodigoProd(), prodDB3.getCodigoProd());
        Assert.assertEquals(produtoAtualizado.getNomeProd(), prodDB3.getNomeProd());
        Assert.assertEquals(produtoAtualizado.getDescricaoProd(), prodDB3.getDescricaoProd());

        // Deleta todos
        List<Produto> listaProdutos = dao.buscarTodos();
        for (Produto prod : listaProdutos) {
            dao.excluir(prod);
        }

    }
}
