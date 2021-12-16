package capitulo1.guessingGame;

public class GuessGame {
	
	private int abrangencia;
	
	Integer numSorteado;

	private boolean ninguemAcertou = true;

	private String ganhou = null;
	
	public GuessGame(int abrangencia) {
		this.abrangencia = abrangencia;
		new Player(abrangencia);
		this.numSorteado = (int) (Math.random() * abrangencia);
	}
	

	public void start() {
		
		long inicio = System.currentTimeMillis();
		
		int playerDaVez = 0;
		
		System.out.println("O numero sorteado nesse jogo eh: " + numSorteado);
		
		Player[] players = new Player[3];
		
		Player jogador1 = new Player("Joao");
		players[0] = jogador1;
		Player jogador2 = new Player("Maria");
		players[1] = jogador2;
		Player jogador3 = new Player("Mark");
		players[2] = jogador3;
		
		while(ninguemAcertou) {
			
			int chuteAtual = players[playerDaVez].chuta();
			System.out.println(players[playerDaVez].getNome() + " chutou o numero " + chuteAtual);
			if (chuteAtual == numSorteado) {
				ganhou = players[playerDaVez].getNome();
				ninguemAcertou = !ninguemAcertou;
			}
			
			playerDaVez++;
			
			if (playerDaVez == 3) playerDaVez = 0;
		}
		
		System.out.println("TEMOS UM VENCEDOR!! " + this.ganhou + " acertou!");
		System.out.println("Jogo encerrado!");
		
		long fim = System.currentTimeMillis();
		
		System.out.println("TEMPO TOTAL DE EXECUÇÃO: " + (fim - inicio) + "ms");
		
	}

}