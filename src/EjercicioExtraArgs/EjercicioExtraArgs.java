package EjercicioExtraArgs;

public class EjercicioExtraArgs {

	public static void main(String[] args) {
		
		if (args.length < 2)
			System.out.println("El programa debe tener dos argumentos de entrada");
		else {
			try {
				float num1 = Float.parseFloat(args[0]);
				float num2 = Float.parseFloat(args[1]);
				System.out.println(num1 + num2);
				System.out.println(num1 - num2);
				System.out.println(num1 * num2);
				if (num2 == 0)
					System.out.println("No se puede dividir entre 0");
				else
					System.out.println(num1 / num2);
				
			} catch (Exception e) {
				System.out.println("Debes introducir sólo números como argumentos");
			}
		}
	}

}
