public class HTML extends Relatorio {
    public HTML(String dados) {
        super(dados);
    }

    public void acceptPDF(Visitor v) {
        v.gerarPDF(this);
    }

    public void acceptExcel(Visitor v) {
        v.gerarExcel(this);
    }
}
