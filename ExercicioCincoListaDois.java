// Escrever um algoritmo que leia a partir do teclado dois números reais e um dos símbolos de operação: + , - , * , / ou ^ . O algoritmo deve retornar o resultado da operação. 
// Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo deve apresentar uma mensagem de erro, informando que o símbolo da operação é inválido.

import java.util.Scanner;

public class ExercicioCincoListaDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numUm, numDois;        
            String titulo = "Resultado da Operação";
            System.out.println(titulo);        
            System.out.println("Digite o primeiro número: ");
            numUm = sc.nextInt();        
            System.out.println("Digite o segundo número: ");
            numDois = sc.nextInt();        
            System.out.println("Digite o símbolo de operação: (+, -, *, /, ^):");
            char operador = sc.next().charAt(0);
            switch (operador) {
                case '+':
                System.out.println(numUm + numDois);    
                break;
                case '-':
                System.out.println(numUm - numDois);    
                break;
                case '*':
                System.out.println(numUm * numDois);    
                break;
                case '/':
                System.out.println(numUm / numDois);    
                break;
                case '^':
                System.out.println(numUm ^ numDois);    
                break;
                default:
                System.out.println("Operador inválido");
                break;
                              
            }
                    sc.close();
    }
}

