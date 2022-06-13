package main;

public class Categoria { //CLASSE PAI
    private String nomeCategoria;
    private String setor;

    public Categoria(String nomeCategoria, String setor) {
        this.nomeCategoria = nomeCategoria;
        this.setor = setor;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
