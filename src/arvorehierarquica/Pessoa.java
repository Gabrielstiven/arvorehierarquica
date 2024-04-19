
package arvorehierarquica;


 // @author gabriel
 
public class Pessoa {
    protected String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

        public String detalhePessoa() {
        return "DADOS DA PESSOA" + "\nnome: " + nome + "\nidade: " + idade + "\nsexo: " + sexo + "\n";
    }
    
}
