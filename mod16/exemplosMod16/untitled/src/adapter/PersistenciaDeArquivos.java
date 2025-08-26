package adapter;

import java.io.File;

public interface PersistenciaDeArquivos {
    public void gravarArquivos(File arquivo);
    public File lerArquivos(String caminho);
}
