package desafios;

public class Desafio2 {

	// entrada, deve ser N = 10000
    static int N = 20;

    // d guarda quantos divisores n e n+1 possuem
    static int d[] = new int[N];

       static void Divisores(){
            for (int i = 1; i < N; i++){
                for (int j = 1; j * j <= i; j++) {
                    if (i % j == 0){                // checar se j � divisor de i
                       if (j * j == i) d[i]++;      // checar se � um quadrado perfeito
                       d[i] += 2;
                    }
                }
            }

            for (int i = 2; i < N; i++){
                if (d[i-1] == d[i]){            // caso em que n e n + 1 tem o mesmo n�mero de divisores
                    System.out.println(i-1);    // imprimi n e n + 1
                }
            }

        }


    public static void main(String[] args) {
        Divisores();
    }
}

