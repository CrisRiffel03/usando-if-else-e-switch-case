package ifElseAndSwitchCase;

import java.util.Scanner;

public class usandoIfElseAndSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1=scan.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2=scan.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3=scan.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double nota4=scan.nextDouble();
		
		double media=(nota1+nota2+nota3+nota4)/4;
		
		String aproveitamento="";
		
		if(media>=9 && media<=10) {
			aproveitamento="A";
		}else if(media>=7.5 && media<9) {
			aproveitamento="B";
		}else if(media>=6 && media<7.5) {
			aproveitamento="C";
		}else if(media>=4 && media<6) {
			aproveitamento="D";
		}else if(media>=0 && media<4) {
			aproveitamento="E";
		}
		
		System.out.println("Nota 1 = " + nota1);
		System.out.println("Nota 2 = " + nota2);
		System.out.println("Nota 3 = " + nota3);
		System.out.println("Nota 4 = " + nota4);
		System.out.println("Média = " + media);
		System.out.println("Aproveitamento " + aproveitamento);
		
		switch(aproveitamento){
		case "A":
		case "B":
		case "C":System.out.println("Aprovado");break;
		case "D":System.out.println("Recuperação");break;
		default:System.out.println("Reprovado"); 
		}
	}

}
