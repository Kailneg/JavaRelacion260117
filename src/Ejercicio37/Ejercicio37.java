package Ejercicio37;

public class Ejercicio37 {

	public static void main(String[] args) {
		int[] arrayBase = {0,1,2,3,4};
		int[] arrayInsertar = {1,2,3};
		
		arrayBase = InsertaArrayEnArray(arrayBase, 3, arrayInsertar);

		for (int i = 0; i < arrayBase.length; i++)
			System.out.println(arrayBase[i]);
	}

	public static int[] InsertaArrayEnArray(int[] arrayBase, int posicion, int[] arrayInsertar) {
		int tamañoTotal = arrayBase.length+arrayInsertar.length;
		int[] nuevoArray = new int[tamañoTotal];
		
		for (int i = 0; i < posicion; i++)
			nuevoArray[i] = arrayBase[i];
		for (int i = posicion, j = 0; j < arrayInsertar.length; i++, j++)
			nuevoArray[i] = arrayInsertar[j];
		for (int i = posicion + arrayInsertar.length, j = posicion; i < tamañoTotal; i++, j++)
			nuevoArray[i] = arrayBase[j];
		
		return nuevoArray;
	}
}
