public class Excel extends Relatorio {
    public Excel(String dados) {
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

    public void acceptXML(Visitor v) {
        v.gerarXML(this);
    }
}
