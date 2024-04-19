
package arvorehierarquica;

 // @author gabriel
 
public class Aluno extends Pessoa{
    private double matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno(a)" + this.nome);
    }

    public double getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(double m) {
        this.matricula = m ;
    }

    public void setCurso(String cu) {
        this.curso = cu;
    }
    
}
