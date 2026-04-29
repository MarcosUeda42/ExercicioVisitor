abstract class Relatorio {
    private String dados;

    public Relatorio(String dados) {
        this.dados = dados;
    }

    public String getDados() {
        return dados;
    }

    abstract public void accept(Visitor v);
}