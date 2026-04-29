public class PDF extends Relatorio {
    public PDF(String dados) {
        super(dados);
    }
    
    public void accept(Visitor v) {
        v.gerarPDF(this);
    }
}
