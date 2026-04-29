public class GerarVisitor implements Visitor {
    @Override
    public void gerarPDF(PDF pdf) {
        System.out.println("Gerando PDF de " + pdf.getDados() + ".pdf");
    }

    @Override
    public void gerarPDF(Excel excel) {
        System.out.println("Gerando PDF de " + excel.getDados() + ".excel");
    }

    @Override
    public void gerarPDF(HTML html) {
        System.out.println("Gerando PDF de " + html.getDados() + ".html"); 
    }

    @Override
    public void gerarPDF(XML xml) {        
        System.out.println("Gerando PDF de " + xml.getDados() + ".xml");
    }   

    
}
