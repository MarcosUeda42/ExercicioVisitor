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

    @Override
    public void gerarExcel(PDF pdf) {
        System.out.println("Gerando Excel de " + pdf.getDados() + ".pdf");
    }

    @Override
    public void gerarExcel(Excel excel) {
        System.out.println("Gerando Excel de " + excel.getDados() + ".excel");
    }

    @Override
    public void gerarExcel(HTML html) {
        System.out.println("Gerando Excel de " + html.getDados() + ".html"); 
    }

    @Override
    public void gerarExcel(XML xml) {        
        System.out.println("Gerando Excel de " + xml.getDados() + ".xml");
    }   
}
