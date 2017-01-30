package Ejercicio34;

public class Ejercicio34 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		a = BorraDeArray(a, 2);
		
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
	
	public static int[] BorraDeArray (int[] array, int posicion){
		int[] arrayReturn = new int[array.length-1];
		
		for (int i = 0; i < posicion; i++)
			arrayReturn[i] = array[i];
		for (int i = posicion+1, j = 0; i < arrayReturn.length; i++, j++)
			arrayReturn[i] = array[i];
		
		return arrayReturn;
		
	}
}
