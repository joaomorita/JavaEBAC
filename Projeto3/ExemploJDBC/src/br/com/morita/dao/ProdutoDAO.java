package br.com.morita.dao;
import br.com.morita.domain.Produto;
import br.com.morita.genreic.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto prod) throws Exception{
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PROD (ID, CODIGO, NOME, DESCRICAO) VALUES (nextval('SQ_PROD'),?,?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, prod.getCodigoProd());
            stm.setString(2, prod.getNomeProd());
            stm.setString(3, prod.getDescricaoProd());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Produto consultar(String codigoProd) throws Exception{
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto prod = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PROD WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigoProd);
            rs = stm.executeQuery();

            if (rs.next()) {
                prod = new Produto();
                prod.setCodigoProd(rs.getString("CODIGO"));
                prod.setNomeProd(rs.getString("NOME"));
                prod.setDescricaoProd(rs.getString("DESCRICAO"));
                prod.setId(rs.getLong("id"));
            }
            return prod;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Produto produto) throws Exception{
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PROD WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getCodigoProd());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> listaProdutos = new ArrayList<>();
        Produto produto = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PROD";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String codigo = rs.getString("CODIGO");
                String descricao = rs.getString("DESCRICAO");

                produto.setId(id);
                produto.setNomeProd(nome);
                produto.setCodigoProd(codigo);
                produto.setDescricaoProd(descricao);

                listaProdutos.add(produto);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaProdutos;
    }

    @Override
    public Integer atualizar(Produto produtoAtualizado) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE TB_PROD SET CODIGO = ?, NOME = ?, DESCRICAO = ? WHERE ID = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produtoAtualizado.getCodigoProd());
            stm.setString(2, produtoAtualizado.getNomeProd());
            stm.setString(3, produtoAtualizado.getDescricaoProd());
            stm.setLong(4, produtoAtualizado.getId());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
