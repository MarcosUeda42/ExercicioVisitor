import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Relatorio> list = new ArrayList<Relatorio>();
        list.add(new PDF("Relatório de Vendas"));
        list.add(new Excel("Relatório de Estoque"));
        list.add(new HTML("Relatório de Clientes"));
        list.add(new XML("Relatório de Fornecedores"));

        GerarVisitor visitor = new GerarVisitor();
        
        list.get(0).accept(visitor);
        list.get(1).accept(visitor);
        list.get(2).accept(visitor);    
        list.get(3).accept(visitor);
    }
}
