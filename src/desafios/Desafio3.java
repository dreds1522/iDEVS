package desafios;

import java.util.*;
public class Desafio3 {


    // método que determina se o número é primo ou nao
    static int numeroPrimo(int n) {
        if (n <= 1) return 0;
        if (n <= 3) return 1;
        if (n % 2 == 0 || n % 3 == 0) return 0;
       for (int i = 5; i * i <= n; i = i + 6){
            if (n % i == 0 || n % (i + 2) == 0) return 0;
        }
       return 1;
    }

    // Método para encontrar os primos cujas somas sejam dada pela somas de primos consecutivos
    static String ultimoPrimoSomaConsecutiva(int n)  {

       int count = 0;

       // Array para guardar os números primos
       ArrayList<Integer> primosArray = new ArrayList<>();

        for (int i = 2; i <= n; i++){
            // adiconamos os primos encontrados
            if (numeroPrimo(i) == 1){
                primosArray.add(i);
            }
        }

       // inicializando a soma dos primos
       int sum = (int) primosArray.get(0);

       // vetor para guardar o último primo
       int[] ultimoPrimo = new int[1];

       // encontra todos os primos até o número N dado
        for (int i = 1; i < primosArray.size(); i++) {

            // adiciona na soma
            sum += primosArray.get(i);
            if (sum > n) break;

            // passa pelo primos que satisfazem que a soma dos fatores tbm seja primos
            if (numeroPrimo(sum) == 1){
                for (int j = 0; j < sum; j++) {
                    // leio o último primo
                    ultimoPrimo[0] = sum;
                }
            }
        }

        // retorno do que foi pedido
        return "O maior número primo abaixo de " +  n + " que é obtido através " +
                "da soma consecutiva de números primos é: " + ultimoPrimo[0]+ "\n";
    }

    public static void main(String[] args)  {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual número? \n");
        Integer N = myObj.nextInt();

       System.out.print(ultimoPrimoSomaConsecutiva(N));
    }
}

