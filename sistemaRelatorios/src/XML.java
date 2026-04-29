public class XML extends Relatorio {
    public XML(String dados) {
        super(dados);
    }

    public void accept(Visitor v) {
        v.gerarPDF(this);
    }
    
}
