import java.util.Scanner;

public class ExercicioTresListaDois {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            double delta, a, b, c, x1, x2;
            System.out.println("Informe o coeficiente 'a':");
            a = sc.nextDouble();
            System.out.println("Informe o coeficiente 'b':");
            b = sc.nextDouble();
            System.out.println("Informe o coeficiente 'c':");
            c = sc.nextDouble();
                delta = Math.pow(b, 2) - 4 * a * c;
                if (a == 0 && b == 0 && c != 0) { 
                System.out.println("Coeficientes informados incorretamente.");
                } else if (a == 0 && b != 0) {
                x1 = -c / b;
                System.out.println("Essa é uma equação de primeiro grau. x = " + x1);
                } else if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais"); 
                } else if (delta == 0) { 
                x1 = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais. x1 = x2 = " + x1);
                } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes. x1 = " + x1 + ", x2 = " + x2);
                }
    }
}
   