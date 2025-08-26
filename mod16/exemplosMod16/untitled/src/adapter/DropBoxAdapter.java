package adapter;

import java.io.File;

public class DropBoxAdapter implements PersistenciaDeArquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void gravarArquivos(File arquivo) {
        dropBox.download(arquivo.getAbsolutePath());
    }

    @Override
    public File lerArquivos(String caminho) {
        DropBoxFile file = new DropBoxFile(caminho);
        return new File(file.getLocalPath());
    }
}
