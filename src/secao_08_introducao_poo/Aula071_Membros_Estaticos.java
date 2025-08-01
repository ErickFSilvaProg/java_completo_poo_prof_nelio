package secao_08_introducao_poo;

import java.util.Locale;
import java.util.Scanner;
//import util.Calculator;
import util.Calculator2;

public class Aula071_Membros_Estaticos {
	
//	Método main:
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator();
		
		
		/*
		 * # Membros estáticos:
		 * 
		 * 	- Também chamados membros de classe.
		 * 
		 * 		Em oposição a membros e instâncias.
		 * 
		 * 
		 * 	- São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
		 * 
		 * 
		 * 	- Aplicação comuns:
		 * 
		 * 		Classes utilitárias -> Math.sqrt(double).
		 * 		Declarações de constantes.
		 * 
		 * 
		 * 	- Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.
		 * 
		 * 
		 *  - Exemplo:
		 *  
		 *  	Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar o valor de PI com duas casas decimais.
		 *  
		 *  
		 *  * Versão 1: Método na própria classe do programa. Dentro de um método estático você não pode chamar membros de instância da mesma classe.
		 *  
		 *  * Versão 2: Classe Calculator com membros de instância.
		 *  
		 *  * Versão 3: Classe Calculator com método estático.
		 *  
		 */
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circumference(radius);
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
		
		
//		Fecha Scanner:
		sc.close();
		
	}

}
