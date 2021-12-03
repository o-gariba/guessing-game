package capitulo1.guessingGame;

/**
 * 
 * @author Pedro
 * 
 * Objetivo: Criar um jogo, que tenha 3 jogadores gerados pela maquina, cujo objetivo � assertar um n�mero aleat�rio gerado tmb pela m�quina. O primeiro jogador que assertar o n�mero ganha e o jogo � finalizado.
 * 
 * O que fazer:
 * - Criar 3 classes: GameLauncher, GuessGame e Player
 * - add o m�todo MAIN no GameLauncher
 * - Criar a l�gica do jogo em GuessGame com um n�mero sorteado, a contabilidade dos n�meros chutados, criar os jogadores, quem foi o vencedor
 * - Popular o Player com um nome e o m�todo chutar um n�mero (excluindo n�meros j� chutados)
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
