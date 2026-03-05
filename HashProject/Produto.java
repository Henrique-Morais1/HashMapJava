
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, double preco, int quantidade)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return this.nome + "-" + this.preco + "-" + this.quantidade;
    }
    
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        return 0;
    }
}