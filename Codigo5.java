
			import java.util.Scanner; //Faltaba importar Scanner

public class Codigo5 {

	public static void main(String[] args) { //Agregué punto de entrada
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número: "); //Cambie la posición del parentesis para poder cerrar
		String ni = s.nextLine();
		int c = Integer.parseInt(ni); //Lo cambié a entero bien, porque solo decia ni, le faltaba el resto

		int afo = 0;
		int noAfo = 0;

		while (c > 0) {
			int digito = c % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			}
			c /= 10; //Lo puse adentro del bloque para que corra sin error
		}

		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado."); //Le faltaba la t a printIn
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
	}

}
