import java.util.Scanner;

public class PerguntaUm {
    // 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
    // (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
    // ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

    public static void main(String[] args) {
        int numeroInformado = 74; // Número que será usado para saber se está na sequência

        int num1 = 0;
        int num2 = 1;
        int ultimoNumeroSequencia = num1 + num2;
        while(ultimoNumeroSequencia < numeroInformado){
            num1 = num2;
            num2 = ultimoNumeroSequencia;
            ultimoNumeroSequencia = num1 + num2;
        }
        if(ultimoNumeroSequencia == numeroInformado){
            System.out.println("O Número está na sequência de Fibonacci");
        } else {
            System.out.println("O Número não está na sequência de Fibonacci");
        }
    }


}
