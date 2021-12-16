package capitulo1.guessingGame;

/**
 * 
 * @author Pedro
 * 
 * Objetivo: Criar um jogo, que tenha 3 jogadores gerados pela maquina, cujo objetivo � acertar um n�mero aleat�rio gerado tmb pela m�quina. O primeiro jogador que acertar o n�mero ganha e o jogo � finalizado.
 * 
 * O que fazer:
 * - Criar 3 classes: GameLauncher, GuessGame e Player
 * - add o m�todo MAIN no GameLauncher
 * - Criar a l�gica do jogo em GuessGame com um n�mero sorteado, a contabilidade dos n�meros chutados, criar os jogadores, quem foi o vencedor
 * - Popular o Player com um nome e o m�todo chutar um n�mero (excluindo n�meros j� chutados)
 * - iniciar o jogo na main
 * 
 * Desafios:
 * - Como fazer com que os jogadores chutem apenas os n�meros poss�veis (que ainda n�o foram ditos pelos demais jogadores)?
 * 
 * Aprimoramentos
 * 1.1 - redu��o na verbosidade do c�digo no processo das rodadas de cada jogador, agora os jogadores podem aumentar sem o aumento extensivo do n�mero de linhas de c�digo
 * 1.2 - Novo algor�timo para busca de um n�mero ainda n�o chutado, n�o apenas randomizado, mas que faz a busca do primeiro numero n�o chutado a partir do primeiro numero possivel 0
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
