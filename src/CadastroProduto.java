import java.util.ArrayList;


public class CadastroProduto implements Cadastrador {
	
@Override
public String Cadastrar(){
		
		Dados produto;  
        produto = new Dados();  
          
        produto.setNomeProduto("Joao");  
        produto.setQuantidade(18);  
        produto.setDescricao("Professor");  
          
        ArrayList<Dados> Produtos = new ArrayList<Dados>();  
          
        Produtos.add(produto);  
          return ("CADASTRO DE PRODUTO REALIZADO !!!");
     }  
  
}



