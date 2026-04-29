public class XML extends Relatorio {
    public XML(String dados) {
        super(dados);
    }

    public void acceptPDF(Visitor v) {
        v.gerarPDF(this);
    }

    public void acceptExcel(Visitor v) {
        v.gerarExcel(this);
    }

    public void acceptHTML(Visitor v) {
        v.gerarHTML(this);
    }

}
