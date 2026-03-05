
/**
 * Escreva uma descrição da classe AnimalT1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AnimalT1
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String especie;
    private String habilidade;
    
    public AnimalT1(String especie, String habilidade){
        this.especie = especie;
        this.habilidade = habilidade;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getHabilidade(){
        return this.habilidade;
    }
    
    public void setHabilidade(String habilidade){
        this.habilidade = habilidade;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("-Especie-").append(this.especie);
        sb.append("-Habilidade-").append(this.habilidade);
        
        return sb.toString();
    }
}