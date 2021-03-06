package alarcos.test.observer;

import alarcos.patrones.observer2.BluRayPlayer;
import alarcos.patrones.observer2.MyBluRayPlayer;
import alarcos.patrones.observer2.MyRemoteControl;
import alarcos.patrones.observer2.MyStereo;
import alarcos.patrones.observer2.RemoteControl;
import alarcos.patrones.observer2.Stereo;

/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_observer extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_observer(String sTestName)
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
		
		
		System.out.println("inicio del test: bridge, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			 MyBluRayPlayer bluRay = new MyBluRayPlayer();
		        MyStereo stereo = new MyStereo();
		        MyRemoteControl rc = new MyRemoteControl(bluRay, stereo);
		        rc.pressPowerButton();
		        rc.pressPowerButton();
			
			
		}
				
		System.out.println("fin del test: bridge, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}