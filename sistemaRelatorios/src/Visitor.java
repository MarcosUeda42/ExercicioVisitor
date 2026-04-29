interface Visitor {
    public void gerarPDF(PDF pdf);
    public void gerarPDF(Excel excel);
    public void gerarPDF(HTML html);
    public void gerarPDF(XML xml);  

    public void gerarExcel(PDF pdf);
    public void gerarExcel(Excel excel);
    public void gerarExcel(HTML html);
    public void gerarExcel(XML xml);  
} 
