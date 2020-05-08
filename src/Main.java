
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// impressao na console ( %.2f float 2 casas decimais)
/*
		double x = 213.4684;
		System.out.printf("Teste %.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("Teste %.2f%n", x);

		// cast (double) (int)
		int r = 3;
		int s = 17;
		double y = 6;
		y = (double) s / r;
		System.out.printf("%.4f%n", y);
		r = (int) (s / y);
		System.out.println("teste " + r);

		// input dados ( Scanner - scan.next string scan.nextint int )
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma string : ");
		String xc = scan.next();
		System.out.println("Você digitou o valor string :  " + xc);
		System.out.print("Digite uma int : ");
		int ic = scan.nextInt();
		System.out.println("Você digitou o valor int :  " + ic);

		Locale.setDefault(Locale.US);
		System.out.print("Digite uma Double : ");
		double dc = scan.nextDouble();
		System.out.println("Você digitou o valor double :  " + dc);

		System.out.println("Digite  uma char: ");
		char cc = scan.next().charAt(0);
		System.out.println("Você digitou o valor char :  " + cc);
		
		scan.close(); 
*/
		Scanner sc =  new Scanner(System.in);  
		System.out.print("digite um dia da semana: " );
		int dia =  sc.nextInt(); 
/*		
		if (dia == 1)
		{ System.out.println("Domingo");
		}
		else if(dia == 2)
		{ System.out.println("segunda");
		}
		else if(dia == 3)
		{ System.out.println("terça");
		}
		else if(dia == 4)
		{ System.out.println("quarta");
		}
		else if(dia == 5)
		{ System.out.println("quinta");
		}
		else if(dia == 6)
		{ System.out.println("sexta");
		}
		else if(dia == 7)
		{ System.out.println("Sabado");
		}
		else 
		{System.out.println("Dia  Invalido   ");
		}
		
*/
		String  xdia = ""; 
		
		switch (dia)
		{
			case 1: 
				xdia =  "Domingo";
				break;
			case 2: 
				xdia =  "segunda";
				break;
			case 3: 
				xdia =  "terça";
				break;
			case 4: 
				xdia =  "quarta";
				break;
			case 5: 
				xdia =  "quinta";
				break;
			case 6: 
				xdia =  "sexta";
				break;
			case 7: 
				xdia =  "Sabado";
				break;
			default: 
				xdia =  "Dia  Invalido  ";
				break;
		}
		
		System.out.println(xdia );
		
		
		
		
		String  stringCondicaoTernaria =  ""; 
		
		stringCondicaoTernaria = (dia < 4 )? "Inicio da semana" :  "fim da semana"  ; 
		
		System.out.print( stringCondicaoTernaria );
		
		
		
		sc.close(); 
	}

}
