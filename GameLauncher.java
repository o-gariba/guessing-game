package capitulo1.guessingGame;

/**
 * 
 * @author Pedro
 * 
 * Objetivo: Criar um jogo, que tenha 3 jogadores gerados pela maquina, cujo objetivo é acertar um número aleatório gerado tmb pela máquina. O primeiro jogador que acertar o número ganha e o jogo é finalizado.
 * 
 * O que fazer:
 * - Criar 3 classes: GameLauncher, GuessGame e Player
 * - add o método MAIN no GameLauncher
 * - Criar a lógica do jogo em GuessGame com um número sorteado, a contabilidade dos números chutados, criar os jogadores, quem foi o vencedor
 * - Popular o Player com um nome e o método chutar um número (excluindo números já chutados)
 * - iniciar o jogo na main
 * 
 * Desafios:
 * - Como fazer com que os jogadores chutem apenas os números possíveis (que ainda não foram ditos pelos demais jogadores)?
 * 
 * Aprimoramentos
 * 1.1 - redução na verbosidade do código no processo das rodadas de cada jogador, agora os jogadores podem aumentar sem o aumento extensivo do número de linhas de código
 * 1.2 - Novo algorítimo para busca de um número ainda não chutado, não apenas randomizado, mas que faz a busca do primeiro numero não chutado a partir do primeiro numero possivel 0
 * 
 * @version 1.2
 *
 */

public class GameLauncher {

	public static void main(String[] args) {
		
		GuessGame jogo1 = new GuessGame(2000);
		jogo1.start();
		
	}

}
