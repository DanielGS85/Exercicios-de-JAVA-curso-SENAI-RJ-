/** 
 * Este código solicita ao usuário que digite seu nome e o cumprimenta.
 * O que faz: Lê uma entrada do usuário e exibe uma saudação personalizada.
 * Quando usar: Quando for necessário interagir com o usuário via entrada de dados.
 * Como usar: Utiliza a classe Scanner para capturar dados do teclado e exibe com System.out.println.
 * Onde usar: Em sistemas que exigem entrada de dados do usuário, como cadastros ou formulários.
 * Projetos aplicáveis: Sistemas de cadastro, formulários de login, aplicativos de terminal interativos.
 */

import java.util.Scanner; // Importa a classe Scanner do pacote java.util. Usada para capturar entrada de dados do usuário via teclado.

public class Nome { // Declaração da classe pública chamada Nome. Define o escopo do programa.
    public static void main(String[] args) { // Método principal que inicia a execução do programa.
        Scanner leia = new Scanner(System.in); // Cria um objeto Scanner chamado leia para capturar entrada do teclado.
        System.out.println("Digite o seu nome: "); // Exibe a mensagem solicitando que o usuário digite seu nome.
        String nome = leia.nextLine(); // Lê a linha digitada pelo usuário e armazena na variável nome.
        System.out.println("Olá, " + nome + "!"); // Exibe a saudação personalizada com o nome digitado.
        leia.close(); // Fecha o objeto Scanner para liberar recursos do sistema.
    }      // Fecha o bloco do método main. Encerra a execução principal do programa.
}       // Fecha o bloco da classe Nome. Finaliza a definição da classe.
