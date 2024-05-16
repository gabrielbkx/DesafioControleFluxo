import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dois parâmetros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro valor não pode ser maior que o segundo");
    }
}
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
       if (parametroUm >= parametroDois) {
           throw new ParametrosInvalidosException();
       }
        int contagem = parametroDois - parametroUm;
        for (int iterador = 1; iterador < contagem; iterador++) {
            System.out.println("Iprimindo o número " + iterador);
    }


        }
}