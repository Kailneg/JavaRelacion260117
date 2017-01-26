package Ejercicio33;

public class Ejercicio33 {

	public static void main(String[] args) {
		int[] miArray = {3, 4, 5, 7, 2};
		miArray = InsertarEnArray(miArray, 454, 3);
		
		for (int i = 0; i < miArray.length; i++)
			System.out.println(miArray[i]);
	}

	public static int[] InsertarEnArray (int[] array, int valor, int posicion){
		int[] arrayReturn = new int[array.length+1];
		
		for (int i = 0; i < posicion; i++){
			arrayReturn[i] = array[i];
		}
		arrayReturn[posicion] = valor;
		for (int i = posicion + 1; i < arrayReturn.length; i++){
			arrayReturn[i] = array[i-1];
		}
		
		return arrayReturn;
	}
}
