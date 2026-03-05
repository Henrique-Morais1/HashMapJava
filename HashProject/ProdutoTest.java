import java.util.HashMap;
/**
 * Escreva uma descrição da classe ProdutoTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ProdutoTest
{
    public static void main(String[] args){
        System.out.println("--------Tudo a Bombar--------");
        
        Produto p001 = new Produto("Produto1", 1.20, 7);
        Produto p002 = new Produto("Produto2", 1.60, 9);
        Produto p003 = new Produto("Produto3", 1.30, 5);
        Produto p004 = new Produto("Produto4", 1.10, 8);
        Produto p005 = new Produto("Produto5", 1.50, 4);
        
        HashMap<String, Produto> produtos = new HashMap<>();
        
        produtos.put("P001", p001);
        produtos.put("P002", p002);
        produtos.put("P003", p003);
        produtos.put("P004", p004);
        produtos.put("P005", p005);
        
        // Imprimir as chaves do hashMap
        for(String chave : produtos.keySet()){
            System.out.println(chave);
        }
        
        // Imprimir o toString de todos os produtos do hashMap
        for(Produto p : produtos.values()){
            System.out.println(p);
        }
    }
}