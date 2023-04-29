//  Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve ser dado de troco para um pagamento efetuado. 
// O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que o valor da compra, a máquina deve apresentar uma mensagem, informando que a quantia paga é insuficiente para realizar a compra. 
// A máquina aceita apenas notas de R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.

import java.util.Scanner;

public class ExercicioDoisListaDois {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, valordaCompra, valorPago, troco;
            String titulo = "Máquina de Venda Automática";
            System.out.println(titulo);        
            System.out.println("Informe o valor da compra:");
            valorPago = sc.nextInt();       
            System.out.println("Informe o valor de pagamento:");
            valordaCompra = sc.nextInt();        
            troco = (valordaCompra - valorPago);
                if (troco < 0) {
                System.out.println("A quantia de pagamento é insuficiente para realizar o pagamento.");
                } else {
                nota50 = (troco / 50);
                troco = troco % 50;
                nota20 = (troco / 20);
                troco = troco % 20;
                nota10 = (troco / 10);
                troco = troco % 10;
                nota5 = (troco / 5);
                troco = troco % 5;
                nota2 = (troco / 2);
                troco = troco % 2;
                nota1 = (troco / 1);          
                }
                    System.out.println("Quantidade de notas necessárias:");
                    System.out.println("R$ 50,00: " + nota50);
                    System.out.println("R$ 20,00: " + nota20);
                    System.out.println("R$ 10,00: " + nota10);
                    System.out.println("R$ 5,00: " + nota5);
                    System.out.println("R$ 2,00: " + nota2);
                    System.out.println("R$ 1,00: " + nota1);
                        sc.close(); 
    }
}
