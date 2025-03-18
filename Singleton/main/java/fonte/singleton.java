package main.java.fonte;

public class singleton {

    private singleton() {};
    private static singleton instance = new singleton();
    public static singleton getInstance() {
        return instance;
    }

    private String marcaImpressora;
    private String usuarioLogado;

    public String getMarcaImpressora() {
        return marcaImpressora;
    }

    public void setMarcaImpressora(String marcaImpressora) {
        this.marcaImpressora = marcaImpressora;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}



