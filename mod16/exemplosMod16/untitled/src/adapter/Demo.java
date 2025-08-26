package adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String file = "teste.txt";
        DropBox dropBox = new DropBox();
        PersistenciaDeArquivos arquivos = new DropBoxAdapter(dropBox);
        arquivos.gravarArquivos(new File(file));
    }
}
