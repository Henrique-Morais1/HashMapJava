
/**
 * Escreva uma descrição da classe ZoologicoDoCaosT1Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ZoologicoDoCaosT1Teste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args){
        // Criar miguinhos da KIKA
        AnimalT1 a1 = new AnimalT1("Felpudo", "Faz rum rum");
        AnimalT1 a2 = new AnimalT1("Orelhudo", "Come cenouras");
        AnimalT1 a3 = new AnimalT1("Duduzinho", "Faz ROM ROM");
        AnimalT1 a4 = new AnimalT1("Jimmy Jones", "Faz ROC ROC");
        AnimalT1 a5 = new AnimalT1("Palmi", "Faz contas de somar");
        // Criar o ZOO
        ZoologicoDoCaosT1 z1 = new ZoologicoDoCaosT1("Z1");
        
        z1.adicionarAnimal(a1);
        z1.adicionarAnimal(a2);
        z1.adicionarAnimal(a3);
        z1.adicionarAnimal(a4);
        z1.adicionarAnimal(a5);
        
        z1.removerAnimal(a1);
        System.out.println(z1.toString());
    }
}