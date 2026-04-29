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

    @Override
    public void gerarHTML(PDF pdf) {
        System.out.println("Gerando HTML de " + pdf.getDados() + ".pdf");
    }

    @Override
    public void gerarHTML(Excel excel) {
        System.out.println("Gerando HTML de " + excel.getDados() + ".excel");
    }

    @Override
    public void gerarHTML(HTML html) {
        System.out.println("Gerando HTML de " + html.getDados() + ".html");
    }

    @Override
    public void gerarHTML(XML xml) {
        System.out.println("Gerando HTML de " + xml.getDados() + ".xml");
    }
}
