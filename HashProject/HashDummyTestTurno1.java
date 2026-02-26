import java.util.HashMap;

/**
 * Escreva uma descrição da classe HashDummyTestTurno1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashDummyTestTurno1
{
    public static void main(String[] args){
        System.out.println("Trabalhar Com HashMap!!!");
        // 1. Criar uma vat do tipo HashMap
        HashMap<String, Integer> alunos = new HashMap<>();
        // 2. Adicionar valores ao HashMap
        alunos.put("Ana", 17);
        alunos.put("João", 29);
        alunos.put("Marcos", 19);
        // 3. Verificar o tamanho do HashMap
        int tamanho = alunos.size();
        System.out.println("O tamanho do HM é = " + tamanho);
        // 4. Verificar size
        alunos.put("Ana", 67);
        // 5. Verificar o tamanho do HashMap
        int tamanho2 = alunos.size();
        System.out.println("O tamanho do HM é = " + tamanho2);
        
        // Vamos adicionar um valor numa chave que já existe
        // E o programa não deve deixar adicionar
        boolean existe = alunos.containsKey("Ana");
        System.out.println("A chave Ana já existe:" + existe);
        if(existe){
            // Não deixa adicionar a key com o valor
            System.out.println("A chave Ana já existe:" + existe + "Não deixo adicionar");
        } else {
            // Deixo adiciobar a key
            System.out.println("A chave Ana já existe:" + existe + "Deixo adicionar");
        }
        // 6. Apanhar o que está guardado na chave Marcos
        Integer valorDaChaveMarcos = alunos.get("Marcos");
        
        int valorDaChaveMarcos2 = alunos.get("Marcos");
        
        System.out.println("O valor de Marcos é " + valorDaChaveMarcos2);
        // 7. Verificar se um valor existe no HMap
        boolean existe19 = alunos.containsValue(19);
        System.out.println("19 existe: " + existe19);
    }
}