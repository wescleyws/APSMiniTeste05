import java.util.ArrayList;


public class CadastroCURSO implements Cadastrador {
	
	@Override
	public String Cadastrar(){
		
		Dados curso;  
        curso = new Dados();  
          
        curso.setNomeCurso("Joao");  
        curso.setvagas("23");  
        curso.setLocal("Universidade Federal da Para");  
          
        ArrayList<Dados> Cursos = new ArrayList<Dados>();  
          
        Cursos.add(curso);
        
        return ("CADASTRO DE CURSO REALIZADO !!!");
          
     }  

}
