package exceptions;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException {
        boolean isCadastrado = false;

        if (!isCadastrado) {
            throw new ClienteNaoEncontradoException("Cliente não encontado");
        }
    }
}
