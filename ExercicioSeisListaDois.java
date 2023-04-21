import java.util.Scanner;

import java.util.Random;

public class ExercicioSeisListaDois {

    public static void main(String[] args) 
      {
      Scanner sc = new Scanner(System.in);
      Random gerador = new Random();
        int maior, menor, numUm, numDois;
        String titulo = "Sorteio de um Número Aleatório";
        System.out.println(titulo);
        System.out.println("Informe o primeiro número:");
        numUm = sc.nextInt();
        System.out.println("Informe o segundo número:");
        numDois = sc.nextInt();
          if (numUm < numDois) {
          menor = numUm;
          maior = numDois;
          } else {
          menor = numDois;
          maior = numUm;
          }
            int numAleatorio = gerador.nextInt(maior - menor) + menor;
            System.out.println("Número aleatório: " + numAleatorio);
              if (numAleatorio % 2 == 0) {
              System.out.println("O número é par!");
              } else {
              System.out.println("O número é ímpar!");
              }
                sc.close();
  }
}
