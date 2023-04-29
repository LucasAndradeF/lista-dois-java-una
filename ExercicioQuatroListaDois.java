// Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o primeiro valor lido seja:
// a. 1: calcular e imprimir o perímetro do círculo.
// b. 2: calcular e imprimir a área do círculo.
// c. 3: calcular e imprimir o volume da esfera.
// Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma mensagem de erro, informando que o código da operação é inválido.

import java.util.Scanner;

public class ExercicioQuatroListaDois {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            int indicador, raio;
            Double perimetro, areaDoCirculo, volumeDaEsfera;
            String titulo = "Calculadora de Perímetro, Área, e Volume";
            System.out.println(titulo);            
            System.out.println("Digite o indicador da operação: ");
            indicador = sc.nextInt();            
            System.out.println("Digite o raio: ");
            raio = sc.nextInt();
                switch (indicador) { 
                    case 1: indicador = 1;
                    perimetro = (2 * Math.PI * raio);
                    System.out.printf("O perímetro do circulo é: %.2f", perimetro);
                    break;
                    case 2: indicador = 2;
                    areaDoCirculo = Math.PI * Math.pow(raio, 2);
                    System.out.printf("A área do círculo é: %.2f", areaDoCirculo);
                    break;                    
                    case 3: indicador = 3;
                    volumeDaEsfera = (4/3 * Math.PI * Math.pow(raio, 3));
                    System.out.printf("O volume da esfera é: %.2f", volumeDaEsfera);
                    break;
                    default: 
                        sc.close();
                }
    }    
}
