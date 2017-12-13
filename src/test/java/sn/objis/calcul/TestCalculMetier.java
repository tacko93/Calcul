 package sn.objis.calcul;

import junit.framework.TestCase;

public class TestCalculMetier extends TestCase {
	CalculMetier calculMetier;
	protected void setUp() throws Exception{
		calculMetier=new CalculMetier();
		super.setUp();
		
	}
	public void testSomme(){
		assertTrue(calculMetier.somme(4, 5)==9);
	}
	public void testProduit(){
		assertTrue(calculMetier.produit(4, 5)==20);
	}
}
