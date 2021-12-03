package capitulo1.guessingGame;

/**
 * 
 * @author Pedro
 * 
 * Objetivo: Criar um jogo, que tenha 3 jogadores gerados pela maquina, cujo objetivo é assertar um número aleatório gerado tmb pela máquina. O primeiro jogador que assertar o número ganha e o jogo é finalizado.
 * 
 * O que fazer:
 * - Criar 3 classes: GameLauncher, GuessGame e Player
 * - add o método MAIN no GameLauncher
 * - Criar a lógica do jogo em GuessGame com um número sorteado, a contabilidade dos números chutados, criar os jogadores, quem foi o vencedor
 * - Popular o Player com um nome e o método chutar um número (excluindo números já chutados)
 * - iniciar o jogo na main
 * 
 * Desafios:
 * - Definir a responsabilidade de quem conferiria se o chute acertou 
 * - Diferenciar o CHUTE do CHUTA (preciso melhorar essa parte)
 * 
 * @version 1.0
 *
 */

public class GameLauncher {

	public static void main(String[] args) {
		
		GuessGame jogo1 = new GuessGame();
		jogo1.start();

	}

}
