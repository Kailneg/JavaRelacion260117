package Ejercicio36;

public class Ejercicio36 {

	public static void main(String[] args) {

		int[] miArrayOriginal = { 0, 1, 2, 4, 8, 2, 2, 9 };
		miArrayOriginal = EliminaElementosArray(miArrayOriginal, 2);

		for (int i = 0; i < miArrayOriginal.length; i++)
			System.out.println(miArrayOriginal[i]);

	}

	public static int[] EliminaElementosArray(int[] array, int valor) {
		// Calcular tamaño
		int tamaño = array.length;
		for (int i = 0; i < array.length; i++)
			if (array[i] == valor)
				tamaño--;

		// Poblar array sin los valores
		int[] nuevoArray = new int[tamaño];
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor)
				continue;

			nuevoArray[contador] = array[i];
			contador++;
		}
		return nuevoArray;
	}
}
