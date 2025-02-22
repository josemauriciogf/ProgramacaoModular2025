import java.util.Scanner;

public class Exercicio5 {

    static Scanner teclado; // Declara teclado

    public static String montarMatriz(String mensagem) {
        int colunas = 5;
        mensagem = mensagem.replace(" ", ""); // Remover espaços extras

        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);
        char[][] matriz = new char[linhas][colunas];

        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.append(matriz[i][j]);
            }
            resultado.append("\n");
        }

        return resultado.toString();
    }

    public static String criptografarMensagem(String mensagem) {
        int colunas = 5;
        mensagem = mensagem.replace(" ", ""); // Remover espaços extras

        int linhas = (int) Math.ceil((double) mensagem.length() / colunas);
        char[][] matriz = new char[linhas][colunas];

        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (index < mensagem.length()) {
                    matriz[i][j] = mensagem.charAt(index++);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        StringBuilder resultadoCriptografado = new StringBuilder();
        int contador = 1;
        for (int j = 0; j < colunas; j++) {  // Percorre as colunas primeiro
            for (int i = 0; i < linhas; i++) {
                if (matriz[i][j] != ' ') {
                    if (contador % 5 == 0) {
                        resultadoCriptografado.append('*'); // Substitui o caractere por "*"
                    } else {
                        resultadoCriptografado.append(matriz[i][j]);
                    }
                    contador++;
                }
            }
        }

        return resultadoCriptografado.toString();
    }

    public static String descriptografarMensagem(String mensagemCriptografada) {
        int colunas = 5;
        String mensagemSemAsteriscos = mensagemCriptografada.replace("*", ""); // Remover os asteriscos

        int linhas = (int) Math.ceil((double) mensagemSemAsteriscos.length() / colunas);
        char[][] matriz = new char[linhas][colunas];

        int index = 0;
        // **Preenchemos a matriz por colunas, já que a criptografia foi feita por colunas**
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                if (index < mensagemSemAsteriscos.length()) {
                    matriz[i][j] = mensagemSemAsteriscos.charAt(index++);
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // **Agora lemos a matriz por linhas, reconstruindo a mensagem original**
        StringBuilder mensagemOriginal = new StringBuilder();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != ' ') {
                    mensagemOriginal.append(matriz[i][j]);
                }
            }
        }

        return mensagemOriginal.toString();
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        String mensagem;

        System.out.println("Vamos criptografar uma mensagem.");
        System.out.println("Digite uma mensagem:");
        mensagem = teclado.nextLine();

        // Exibir matriz montada
        System.out.println("Matriz montada:");
        System.out.println(montarMatriz(mensagem));

        // Exibir mensagem criptografada
        String criptografada = criptografarMensagem(mensagem);
        System.out.println("Mensagem criptografada:");
        System.out.println(criptografada);

        // Exibir mensagem descriptografada
        String descriptografada = descriptografarMensagem(criptografada);
        System.out.println("Mensagem descriptografada:");
        System.out.println(descriptografada);

        teclado.close();
    }
}
