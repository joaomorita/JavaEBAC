package br.com.morita;

import br.com.morita.dao.ClienteMapDAO;
import br.com.morita.dao.IClienteDAO;
import br.com.morita.domain.Cliente;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro," +
                " digite 2 para consultar, digite 3 para excluir, digite 4 para alterar " +
                "ou 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

       while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sairDoPrograma();
            }

           opcao = JOptionPane.showInputDialog(null, "Opção INVÁLIDA! Digite 1 para cadastro," +
                   " digite 2 para consultar, digite 3 para excluir, digite 4 para alterar " +
                   "ou 5 para sair", "Escolha uma opção válida", JOptionPane.INFORMATION_MESSAGE);
       }

       while (isOpcaoValida(opcao)) {
           if (isOpcaoSair(opcao)) {
               sairDoPrograma();
           } else if (isCadastro(opcao)) {
               String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separado por virgula, conforme exemplo: Nome, CPF, telefone, endereço, número, cidade e estado" +
                   "Cadastro", JOptionPane.INFORMATION_MESSAGE);
               cadastrar(dados);
           } else if (isConsultar(opcao)) {
               String dados = JOptionPane.showInputDialog(null, "Digite o CPF para buscar" +
                       "Consulta", JOptionPane.INFORMATION_MESSAGE);

               buscar(dados);
           } else if(isExcluir(opcao)) {
               String dados = JOptionPane.showInputDialog("Digite o cpf para excluir: ");

               excluir(dados);
           } else {
               String dados = JOptionPane.showInputDialog(null,
                       "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                       "Atualização", JOptionPane.INFORMATION_MESSAGE);
               atualizar(dados);
           }
           opcao = JOptionPane.showInputDialog(null, "Opção INVÁLIDA! Digite 1 para cadastro," +
                   " digite 2 para consultar, digite 3 para excluir, digite 4 para alterar " +
                   "ou 5 para sair", "Escolha uma opção válida", JOptionPane.INFORMATION_MESSAGE);
       }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.valueOf((dados)));
        JOptionPane.showMessageDialog(null, "Cliente foi excluído da base de dados! ");
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void buscar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado! " + cliente.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não foi encontrado! ");
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosArray = dados.split(",");
        String[] dadosTratados = new String[7];

        for (int i = 0; i < dadosTratados.length; i++) {
            if (i < dadosArray.length && dadosArray[i] != null && !dadosArray[i].trim().isEmpty()) {
                dadosTratados[i] = dadosArray[i].trim();
            } else{
                dadosTratados[i] = null;
            }
        }

        Cliente cliente = new Cliente(
                dadosTratados[0],
                dadosTratados[1],
                dadosTratados[2],
                dadosTratados[3],
                dadosTratados[4],
                dadosTratados[5],
                dadosTratados[6]);

        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já existe no banco");
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sairDoPrograma() {
        JOptionPane.showMessageDialog(null, "Até logo");
        System.exit(0);
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) ||
                "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}
