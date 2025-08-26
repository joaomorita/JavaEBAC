package exceptions;

import javax.swing.*;

public class APPCliente {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Digite o código do cliente", "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch ( ClienteNaoEncontradoException e ) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

}
