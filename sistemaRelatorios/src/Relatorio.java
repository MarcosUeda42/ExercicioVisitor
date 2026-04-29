abstract class Relatorio {
    private String dados;

    public Relatorio(String dados) {
        this.dados = dados;
    }

    public String getDados() {
        return dados;
    }

    abstract public void acceptPDF(Visitor v);

    abstract public void acceptExcel(Visitor v);

    abstract public void acceptHTML(Visitor v);

    abstract public void acceptXML(Visitor v);
}