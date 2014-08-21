import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CadastrosTest {
	
	private  Cadastros c;
	
	@Before
	public void iniciaTest(){
	c = new Cadastros();
	}

	
	@Test
	public void CadastroCLIENTE() {
		assertEquals("CADASTRO DE CLIENTE REALIZADO !!!",c.Cadastrar(new CadastroCLIENTE()));  
  
	}

	@Test
	public void CadastroPRODUTO() {
		assertEquals("CADASTRO DE PRODUTO REALIZADO !!!",c.Cadastrar(new CadastroProduto()));  

	}

	@Test
	public void CadastroCURSO() {
		assertEquals("CADASTRO DE CURSO REALIZADO !!!",c.Cadastrar(new CadastroCURSO()));  

	}

}
