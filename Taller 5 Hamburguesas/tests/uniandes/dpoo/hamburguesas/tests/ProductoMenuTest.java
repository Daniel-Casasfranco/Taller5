package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;


public class ProductoMenuTest {
 // implementar pruebas para product menu
	
	private ProductoMenu ProductoMenu1;
	
	@BeforeEach
	void setUp( ) throws Exception{
		
		ProductoMenu1 = new ProductoMenu("Papas", 6000);
		
	}
	
	@AfterEach
	void tearDown () throws Exception{
	}
	
	@Test
	void testGetNombre(){
		
		assertEquals("Papas", ProductoMenu1.getNombre(), "No es el nombre correcto");
		
	}
	
	@Test
	void testGetPrecio(){
		
		assertEquals(6000, ProductoMenu1.getPrecio(), "No es el Precio correcto");
		
	}
	
	@Test 
	void testGenerarTextoFactura() {
		String resultadoEsperado ="Papas\n            6000\n";
		
		assertEquals(resultadoEsperado, ProductoMenu1.generarTextoFactura(), "No se genero el texto esperado");
	}
	
}
