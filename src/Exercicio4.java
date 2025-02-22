import java.util.Scanner;

/*
    
Planejamento

1-Pegar mensagem
2-Embaralhar mensagem
3-A cada 5 caracteres da mensagem substituir por um *

*/

public class Exercicio4 {

    static Scanner teclado; //Declara teclado

    public static String montarMatriz(String mensagem) {
        int colunas = 5; // Definir o número de colunas (5)

        // Calcular o número de linhas necessárias
        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);

        // Criar a matriz
        char[][] matriz = new char[linhas][colunas];

        // Preencher a matriz com os caracteres da mensagem
        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                }
            }
        }

        // Montar a string com a matriz para retornar
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.append(matriz[i][j]);
            }
            resultado.append("\n");  // Adicionar uma quebra de linha após cada linha da matriz
        }

        return resultado.toString();
    }

    public static String criptografarMensagem(String mensagem) {
        int colunas = 5; // Definir o número de colunas (5)

        // Calcular o número de linhas necessárias
        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);

        // Criar a matriz
        char[][] matriz = new char[linhas][colunas];

        // Preencher a matriz com os caracteres da mensagem
        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                } else {
                    matriz[i][j] = ' ';  // Preencher com espaços vazios se houver falta de caracteres
                }
            }
        }

        // Montar a string criptografada lendo as colunas
        StringBuilder resultadoCriptografado = new StringBuilder();
        int contador = 1;
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                if (contador % 5 == 0 && contador != 0) {
                    resultadoCriptografado.append('*'); // Substitui o caractere por "*"
                } else {
                    resultadoCriptografado.append(matriz[i][j]);
                }
                contador++;
            }
        }

        // Retornar a mensagem criptografada
        return resultadoCriptografado.toString();
    }

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in); //Declarando teclado
        String mensagem; //Declarando mensagem

        System.out.println("Vamos criptografrar uma mensagem."); 
        System.out.println("Digite uma mensagem:"); 
        mensagem = teclado.nextLine(); //Armazena valor string

        /// Exibir a matriz montada
        String montada = montarMatriz(mensagem);
        System.out.println("Matriz montada:");
        System.out.println(montada);

        // Exibir a mensagem criptografada
        String criptografada = criptografarMensagem(mensagem);
        System.out.println("Mensagem criptografada:");
        System.out.println(criptografada);

        teclado.close(); //Fecha "teclado"
    }
    
}
