package alarcos.test.flyweight;

import java.util.ArrayList;

import alarcos.patrones.decorator.examples.pizzas.MyRelojBase;
import alarcos.patrones.decorator.examples.pizzas.MyRelojBaseCon;
import alarcos.patrones.decorator.examples.pizzas.MyRelojMyS;
import alarcos.patrones.decorator.examples.pizzas.MyRelojMySCon;
import alarcos.patrones.decorator.examples.pizzas.RelojBase;
import alarcos.patrones.decorator.examples.pizzas.RelojMyS;
import alarcos.patrones.flyweight.Solider;
import alarcos.patrones.flyweight.Solider2;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_flyweight extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_flyweight(String sTestName)
	{
		super(sTestName);
	}

	public void setUp() throws Exception
	{
	}

	public void tearDown() throws Exception
	{
	}

	private void test() throws InterruptedException
	{
		
		
		System.out.println("inicio del test: flyweight, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
	        
	         //This is what happens when we don't use flyweight design pattern
	        ArrayList<Solider2> soliders2 = new ArrayList<>();
	        long startTime2 = System.currentTimeMillis();
	        for (int j=0; j<200000; j++){
	            soliders2.add(new Solider2("AK-47","Armour","Helmet"));
	        }
	        long endTime2 = System.currentTimeMillis(); 
			
			
		}
				
		System.out.println("fin del test: flyweight, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}
