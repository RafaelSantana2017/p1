import java.util.Scanner;

public class executar {

	public static void main(String[] args) {

	
	Moto mt = new Moto();
	
	mt.cor = "Preto";
	mt.marca = "Honda";
	mt.modelo = "CBR Twister";

	
	
	
	System.out.println("A cor da moto � "+ mt.cor);
	System.out.println("A marca da moto � "+ mt.marca);
	System.out.println("O modelo da moto �" + mt.modelo);
	System.out.println("Macha Total:"+ mt.maiorMacha);
	System.out.println("----------------");
	System.out.println("O Status da Moto � :"+ mt.Status());
	mt.marchaAcima();
	mt.marchaAcima();
	mt.marchaAcima();
	mt.marchaAcima();
	mt.marchaAcima();
	mt.marchaAcima();
	mt.marchaAcima();
	System.out.println("----------------");
	System.out.println("O Status da Moto � :"+ mt.Status());
	mt.marchaAbaixo();
	mt.marchaAbaixo();
	mt.marchaAbaixo();
	mt.marchaAbaixo();
	mt.marchaAbaixo();
	mt.marchaAbaixo();
	mt.marchaAbaixo();
 
	
	
	
	
	

	

}
}