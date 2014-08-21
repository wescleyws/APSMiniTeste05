import java.util.ArrayList;


public class CadastroCLIENTE implements Cadastrador{
	
	
	@Override
	public String Cadastrar(){
		
		Dados cliente;  
        cliente = new Dados();  
          
        cliente.setNomeCliente("João");  
        cliente.setIdade("18");  
        cliente.setProfissao("Professor");  
          
        ArrayList<Dados> Cadastro = new ArrayList<Dados>();  
          
        Cadastro.add(cliente);  
        
       return ("CADASTRO DE CLIENTE REALIZADO !!!");  
        
          
     }  
  
	}


