// Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo teclado, para que independente da ordem que o usuário digite os números, consiga realizar o sorteio.
// Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e que ele é um número ímpar.

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
