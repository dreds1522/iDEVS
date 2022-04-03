package desafios;

import java.util.Scanner;

public class Desafio1 {

  public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Qual palavra? \n");
        String s = myObj.nextLine();

       // gera um array com os caracteres da string acima
        char[] chars = s.toCharArray();

        int sum = 0;
        for (char ch: chars) {

        // condicoes para letras e pontos - tanto maiúscula quanto minúscula
            boolean condition1 = ch =='a' || ch=='A' ||
                                 ch == 'e'|| ch == 'E' ||
                                 ch == 'i'|| ch=='I' ||
                                 ch == 'o'|| ch=='O' ||
                                 ch == 'u'|| ch=='U' ||
                                 ch == 'l'|| ch=='L'||
                                 ch == 'n'|| ch=='N'||
                                 ch == 'r'|| ch=='R'||
                                 ch == 's'|| ch=='S'||
                                 ch == 't'|| ch=='T';
            boolean condition2 = ch=='d'  || ch=='D' ||
                                 ch == 'g'|| ch=='G';
            boolean condition3 = ch=='b'  || ch=='B' ||
                                 ch == 'c'|| ch=='C' ||
                                 ch == 'm'|| ch=='M' ||
                                 ch == 'p'|| ch=='P' ;
            boolean condition4 = ch=='f'  || ch=='F' ||
                                 ch == 'h'|| ch == 'H' ||
                                 ch == 'v'|| ch == 'V' ||
                                 ch == 'w'|| ch == 'W' ||
                                 ch == 'y'|| ch == 'Y';
            boolean condition5 = ch=='k' || ch == 'K';
            boolean condition6 = ch=='j' || ch == 'J' || ch == 'x' || ch == 'X';
            boolean condition7 = ch=='q' || ch == 'Q' || ch == 'z' || ch == 'Z';

            // aplica à soma a respectiva condicao
            if(condition1) sum = sum + 1;
            if(condition2) sum = sum + 2;
            if(condition3) sum = sum + 3;
            if(condition4) sum = sum + 4;
            if(condition5) sum = sum + 5;
            if(condition6) sum = sum + 8;
            if(condition7) sum = sum + 10;

        }

        //imprimi os pontos totais
        System.out.println("Minha soma é: " + sum);

    }

}
