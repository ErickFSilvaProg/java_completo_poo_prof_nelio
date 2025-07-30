package secao_08_introducao_poo;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Aula065_resolvendo_problema_com_poo {
	
	public static void main(String[] args) {
		
		/*
		 * Resolvendo problema com Orientação a Objetos.
		 * 
		 * Triângulo é um entidade com três atributos: a, b, c.
		 * 
		 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte:
		 * 
		 * 		p = (a + b + c) / 2.0
		 * 		Math.sqrt(p * (p - a) * (p - b) * (p - c))
		 * 
		 * 
		 * # Classe: é a definição do tipo.
		 * 
		 * 	- É um tipo estruturado que pode conter (membros):
		 * 
		 * 		Atributos (dados / campos);
		 * 		Métodos (funções / operações);
		 * 
		 * 
		 *  	- A classe também pode prover muitos outros recursos, tais como:
		 *  
		 *  		Construtores;
		 *  		Sobrecarga;
		 *  		Encapsulamento;
		 *  		Herança;
		 *  		Polimorfismo;
		 *  
		 *  
		 *  	- Exemplos:
		 *  
		 *  		Entidades: Produto, Cliente, Triangulo;
		 *  		Serviços: ProdutoService, ClienteService, EmailService, StorageService;
		 *  		Controladores: ProdutoController, ClienteController;
		 *  		Utilitários: Calculadora, Compactador;
		 *  		Outros: (views, repositórios, gerenciadores, etc);
		 *  
		 *  
		 *  # Objetos: são instâncias de classes.
		 */
		
//		Bibliotecas:
		Locale.setDefault(Locale.US);
		
		
//		Variáveis:
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		double p, areaX, areaY;
		
		
//		Programa:
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (x.a + x.b + x.c) / 2.0;
		areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		
//		Fecha o Scanner:
		sc.close();
		
	}

}
