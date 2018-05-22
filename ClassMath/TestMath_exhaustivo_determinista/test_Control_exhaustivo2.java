package ClassMath.TestMath_exhaustivo_determinista;

import ClassMath.ControlMath;
import ClassMath.Vista;
import ClassMath.TestMath.Util;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class test_Control_exhaustivo2 {
	 public static double getRandomArbitrary(int min, int max) {
			return Math.random() * (max - min) + min;
		}

	/*
	 * se usa la funcion generaEntrada_determinista_determinista. Es decir, el numero de entrada para las funciones que no restringe nuemro de
	 * entradas es determinado por usuario
	 */
	@Test
	public void test() {
		//0,1,2,3, 4, 5, 6
		//1,2,2,3,-1,-1,-1
		/*
		 * inicializar datos necesarios
		 */
		LinkedList<Integer> decisiones=new LinkedList<Integer> ();
		for(int i=0;i<7;i++) {
			decisiones.add(i);
		}
		LinkedList<double[]> entradas=new LinkedList<double[]>();
		Vista vista=new Vista();

		for(int op=0; op<decisiones.size();op++) {
			entradas.add(Util.generaEntrada_determinista(vista.getArgEcus(decisiones.get(op)),100));
		}


		assertNotNull("should not be null", new ControlMath(decisiones,  new LinkedList<Double>(), entradas));		
		assertNotNull("should not be null", new ControlMath(decisiones, new LinkedList<Double>(), entradas));	
		assertNotNull("should not be null", new ControlMath());	

		//se testea la funcion a toda costa
		for(int op=0;op<10;op++) {
			ControlMath object=new ControlMath(decisiones, new LinkedList<Double>(), entradas); 
			double[] entrada=Util.generaEntrada_determinista(vista.getArgEcus(op),100);
			assertEquals(object.select(entrada, op)+"",object.select(entrada, op)+"");
			int x=(int) getRandomArbitrary(0, 99);
			assertEquals(object.select(entrada, op-x)+"",object.select(entrada, op-x)+"");


		}

	}
}













