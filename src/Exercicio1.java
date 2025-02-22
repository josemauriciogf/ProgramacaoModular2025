import java.util.Scanner;

/*
    
Planejamento

1-Perguntar ao usuário a largura e a altura do retângulo
2-Montar retângulo
3-Imprimir retangulo

*/
public class Exercicio1 {

    static Scanner teclado; //Declara teclado

    static void montaRetangulo(int altura, int largura){
        for (int i = 0; i < altura; i++) { //Linhas
            for (int j = 0; j < largura; j++) { //Colunas
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("  "); //Espaço vazio no meio
                }
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        int altura; //Declarando Altura
        int largura; //Declarando Largura
        System.out.println("Vamos montar um retângulo.");
        System.out.println("Digite a largura:"); //Pergunta ao usuario a largura
        largura = teclado.nextInt(); //Armazena valor largura
        System.out.println("Digite a altura:"); //pergunta ao usuário a altura
        altura = teclado.nextInt(); //Armazena valor altura
        montaRetangulo(altura, largura); //Chama a função montaRetangulo
        teclado.close(); //Fecha "teclado"
    }
    
}
