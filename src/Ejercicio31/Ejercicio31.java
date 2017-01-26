package Ejercicio31;

public class Ejercicio31 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,2};
		int[] c = ConcatenaArraysPro(a, b);
		
		for(int i = 0; i < c.length; i++){
			System.out.println(c[i]);
		}
	}

	public static int[] ConcatenaArraysPro (int[] array1, int[] array2){
		int[] arrayReturn = new int[array1.length+array2.length];
		
		for (int i = 0; i < array1.length; i++){
			arrayReturn[i] = array1[i];
		}
		
		for (int i = 0, j = array1.length; i < array2.length; i++, j++){
			arrayReturn[j] = array2[i];
		}
		return arrayReturn;
	}
}
