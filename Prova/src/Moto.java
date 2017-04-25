import java.util.Scanner;

public class Moto {

	public String marca;
	public String modelo;
	public String cor;
	public int macha =0;
	int contmarcha = 0;
	int menorMacha = 0;
	int maiorMacha = 6;
	String On;
	String off;
	boolean Status;

	Moto() {

	}

	Moto(int machaMax) {
		macha = machaMax;

	}
	void marchaAcima() {
		if (macha < maiorMacha) {
			macha = macha + 1;
			System.out.println("Marcha: " + macha);

		} else {

			System.out.println("Limite de marchas excedidas");
		}
	}

	void marchaAbaixo() {
		if (macha > menorMacha) {
			macha = macha - 1;
			System.out.println("Marcha: " + macha);
		} else {

			System.out.println("Limite minimo de marchas excedidos");

		}

	}

	String Status() {
		if (macha > 0) {
			Status = true;
			On = " Ligada";

		} else {
			Status = false;
			On = "Desligada";

		}
		return On;
	}

}
