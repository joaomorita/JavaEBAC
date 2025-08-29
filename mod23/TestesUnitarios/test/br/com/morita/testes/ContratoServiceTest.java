package br.com.morita.testes;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroSalvarTesteComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso na busca", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroBuscarTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso na busca", retorno);
    }

    @Test
    public void alterarTeste() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.alterar();
        Assert.assertEquals("Alterado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroAlterarTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.alterar();
        Assert.assertEquals("Alterado", retorno);
    }

    @Test
    public void excluirTeste() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroExcluirTeste() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido", retorno);
    }
}
