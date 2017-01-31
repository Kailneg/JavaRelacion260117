package Ejercicio35;

public class Ejercicio35 {

	public static void main(String[] args) {
		int[] miArray = {0,1,2,3,4,5};
		
		miArray = Elimina1ElementoArray(miArray, 5);
		
		for(int i = 0; i < miArray.length; i++)
			System.out.println(miArray[i]);

	}

	public static int[] Elimina1ElementoArray (int[] array, int valor){
		int[] arrayReturn = new int[array.length-1];
		boolean eliminado = false;
		int i = 0;
		
		for (; i < array.length && array[i] != valor; i++)
			arrayReturn[i] = array[i];
		i++;
		for (; i < array.length; i++)
			arrayReturn[i-1] = array[i];
		
		return arrayReturn;
	}
}
