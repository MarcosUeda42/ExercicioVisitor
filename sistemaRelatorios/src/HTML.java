public class HTML extends Relatorio {
    public HTML(String dados) {
        super(dados);
    }

    public void accept(Visitor v) {
        v.gerarPDF(this);
    }   
}
