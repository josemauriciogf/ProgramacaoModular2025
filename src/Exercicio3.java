import java.util.Scanner;

public class Exercicio3 {

/*
    
Planejamento

1-Mostrar na tela as 5 opções, neste formato:

"Opção: "

1 - Somar dois números
2 - O maior de dois números
3 - Somar N números
4 - Contador de pares de uma sequência
0 - Sair

Realizar switch case, na qual utilizará métodos

*/


    static Scanner teclado;

    static double lerNumeroDouble(String mensagem){
        double valor;
        System.out.print("\t"+mensagem+": ");
        valor = teclado.nextDouble();
        return valor;
    }


    static void preencherVetor(double[] vetor){
        for (int i=0; i < vetor.length; i++){
            vetor[i] = lerNumeroDouble("Digite um número:");
        }
        
    }

    static void preencherVetor2(double[] vetor){
        for (int i=0; i < vetor.length; i++){
            vetor[i] = lerNumeroDouble("Digite um número:");
        }
        
    }

    static double calcularSomaNumeros(double[] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    } 

    static double calcularMaiorDeDoisNumeros(double[] vetor){
            return Math.max(vetor[0], vetor[1]);
        }

    static double calcularSomaNNumeros(double[] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    } 




    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in); /*Teclado -> Sistema de entrada*/
 
        int opcao = 0; /*Declarar a variável opção*/
        double[] numeros = new double[2]; /*Vetor com dois números*/
        /*Vetor com dois números*/

        double resultadoSomaDoisNumeros; /*Declarar variável do resultado da Soma de Dois números*/
        double resultadoMaiorDeDoisNumeros;
        double resultadoSomaNNumeros;
        int quantidade;

        while (true) {
            System.out.println("Opções:");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - O maior de dois números");
            System.out.println("3 - Somar N números");
            System.out.println("4 - Contador de pares de uma sequência");
            System.out.println("0 - Sair");      
            System.out.print("Digite a opção desejada:: "); 
            if (teclado.hasNextInt()) { /*Verifica se o input é um número inteiro*/
                opcao = teclado.nextInt();
                if (opcao >= 0 && opcao <= 4) { /*Verifica se é válido ou não*/
                    break;
                } else {
                    System.out.println("Erro: Número fora do intervalo permitido. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número entre 0 e 4.");
                teclado.next(); /*Descarta a entrada inválida para evitar loop infinito*/
            }
        }

        /*Switch case */
        switch (opcao) {
            case 0:
                System.out.println("Você escolheu a opção 0: Sair");
                break;
            case 1:
                System.out.println("Você escolheu a opção 1: Somar dois números");
                preencherVetor(numeros);
                resultadoSomaDoisNumeros = calcularSomaNumeros(numeros);
                System.out.printf("Resultado da opção 1, Soma dois números: %.1f%n", resultadoSomaDoisNumeros);
                break;
            case 2:
                System.out.println("Você escolheu a opção 2: O maior de dois números");
                preencherVetor(numeros);
                resultadoMaiorDeDoisNumeros = calcularMaiorDeDoisNumeros(numeros);
                System.out.printf("Resultado da opção 2, O maior de dois números é: %.0f%n", resultadoMaiorDeDoisNumeros);
                break;
            case 3:
                System.out.println("Você escolheu a opção 3: Somar N números");
                System.out.println("Quantos números gostaria de somar?");
                quantidade = teclado.nextInt(); //Armazena valor largura
                double[] numeros2 = new double[quantidade];
                preencherVetor2(numeros2);
                resultadoSomaNNumeros = calcularSomaNNumeros(numeros2);
                System.out.printf("Resultado da opção 3, Soma N números é: %.0f%n", resultadoSomaNNumeros);
                break;
            case 4:
                System.out.println("Você escolheu a opção 4: Contador de pares de uma sequência");
                break;
            default:
                System.out.println("Erro.");
                break;
        }
        teclado.close();
    }
}
