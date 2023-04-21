import java.util.Scanner;

public class ExercicioUmListaDois {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            double numeroUm, numeroDois, numeroTres, maior, menor, mediaAritmetica;
            String titulo = ("Maior, Menor e Media Aritmetica");
            System.out.println(titulo);
            System.out.println("Digite um número: ");
            numeroUm = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            numeroDois = sc.nextDouble();
            System.out.println("Digite o terceiro número: ");
            numeroTres = sc.nextDouble();
                if (numeroUm > numeroDois && numeroUm > numeroTres) {
                maior = numeroUm;
                } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
                maior = numeroDois;
                } else { 
                maior = numeroTres;
                } 
                if (numeroUm < numeroDois && numeroUm < numeroTres) {
                menor = numeroUm;
                } else if (numeroDois < numeroUm && numeroDois < numeroTres) {
                menor = numeroDois;
                } else { menor = numeroTres;
                }
                    mediaAritmetica = (numeroUm + numeroDois + numeroTres) / 3;
                    System.out.println("O maior número é: " + maior);
                    System.out.println("O menor número é: " + menor);
                    System.out.println("A média aritmética é: " + mediaAritmetica);          
                        sc.close();
    }
}
