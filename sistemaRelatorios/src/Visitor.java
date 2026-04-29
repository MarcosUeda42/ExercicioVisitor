interface Visitor {
    public void gerarPDF(PDF pdf);
    public void gerarPDF(Excel excel);
    public void gerarPDF(HTML html);
    public void gerarPDF(XML xml);  
} 
