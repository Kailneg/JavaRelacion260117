package Ejercicio32;

public class Ejercicio32 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = CopiaArrayPro(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] CopiaArrayPro(int[] array){
		int[] arrayReturn = new int[array.length];
		
		for (int i = 0; i < array.length; i++){
			arrayReturn[i] = array[i];
		}
		return arrayReturn;
	}

}
