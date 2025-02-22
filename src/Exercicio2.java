import java.util.Scanner;

public class Exercicio2 {

/*
    
Planejamento

1-Ler notas de exercício (4)
2-Ler notas de prova (2)
3-Ler nota de trabalho (1)
4-Calcular média de exercícios
5-Calcular média de Provas
6-Somar todas as notas
7-Imprimir com duas casas decimais

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
            vetor[i] = lerNumeroDouble("Digite um valor de 0 a 100:");
        }
    }

    static double calcularMedia(double[] vetor, double peso){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return (soma/vetor.length)*peso;
    }


    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        double[] notasExercicios = new double[4]; /*Vetor com 4 notas de exercícios*/
        double[] notasProvas = new double[2]; /*Vetor com 2 notas de provas*/
        double notaTrabalho; /*Nota do trabalho*/
        double mediaExercicios;
        double mediaProvas;
        double notaFinal;
        System.out.println("Digite as notas de exercícios:");
        preencherVetor(notasExercicios);
        System.out.println("Digite as notas de provas:");
        preencherVetor(notasProvas);
        notaTrabalho = lerNumeroDouble("Digite a nota do TP:");

        mediaExercicios = calcularMedia(notasExercicios, 0.2);
        mediaProvas = calcularMedia(notasProvas, 0.6);
        notaFinal = mediaExercicios+mediaProvas+notaTrabalho;
        System.out.printf("Nota Final: %.2f", +notaFinal);

        teclado.close();
    }
}
