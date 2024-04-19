
package arvorehierarquica;


 // @author gabriel
 
public class Arvorehierarquica {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        
        a1.setNome("luis");
        a1.setMatricula(123456);
        a1.setCurso("informática");
        a1.setIdade(30);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.detalhePessoa());
        
        
        //INFORMAÇÕES VISITANTE
        Visitante v1= new Visitante();
        v1.setNome("marcia");
        v1.setIdade(60);
        v1.setSexo("F");
        System.out.println(v1.detalhePessoa());
        
        //informaçoes bolsixta
        Bolsista b1 = new Bolsista();
        b1.setNome("pedro");
        b1.setIdade(19);
        b1.setMatricula(34327846);
        b1.setSexo("M");
        
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.detalhePessoa());
        
        
        
    }
    
}
