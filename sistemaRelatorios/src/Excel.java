public class Excel extends Relatorio {
    public Excel(String dados) {
        super(dados);
    }

    public void accept(Visitor v) {
        v.gerarPDF(this);
    }
    
}
