
import java.util.Scanner;

public class Beecrowd1066 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variáveis
        int valores[] = new int[5];
        int par = 0, impar = 0, positivo = 0, negativo = 0;
        
        //ler valores
        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
            //classificar o valor lido
            if (valores[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (valores[i] > 0) {
                positivo++;
            } else if (valores[i] != 0) {
                negativo++;
            }
        }
        //mostrar resultado no console
        System.out.printf("%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)%n", par, impar, positivo, negativo);
    }
}
