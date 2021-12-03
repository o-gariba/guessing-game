package capitulo1.guessingGame;

public class GuessGame {

	// Sorteia um numero de 0 a 20
	private Integer numSorteado = (int) (Math.random()*21);

	private boolean ninguemAcertou = true;

	private String ganhou = null;

	
	public void start() {
		
		System.out.println("O número sorteado nesse jogo é: " + numSorteado);
		
		Player jogador1 = new Player("João");
		Player jogador2 = new Player("Maria");
		Player jogador3 = new Player("Mark");
		
		while(ninguemAcertou) {
			
			// no metodo chuta, verificar se acerta e como comunica com a classe GuessGame?
			// quando chuta, add o chute no array de numChutados
			int chuteJog1 = jogador1.chuta();
			System.out.println(jogador1.getNome() + " chutou o numero " + chuteJog1);
			if (chuteJog1 == numSorteado) {
				ganhou = jogador1.getNome();
				ninguemAcertou = !ninguemAcertou;
				break;
			}
			
			int chuteJog2 = jogador2.chuta();
			System.out.println(jogador2.getNome() + " chutou o numero " + chuteJog2);
			if (chuteJog2 == numSorteado) {
				ganhou = jogador2.getNome();
				ninguemAcertou = !ninguemAcertou;
				break;
			}
			
			int chuteJog3 = jogador3.chuta();
			System.out.println(jogador3.getNome() + " chutou o numero " + chuteJog3);
			if (chuteJog3 == numSorteado) {
				ganhou = jogador3.getNome();
				ninguemAcertou = !ninguemAcertou;
				break;
			}
		}
		
		System.out.println("TEMOS UM VENCEDOR!! " + this.ganhou + " acertou!");
		System.out.println("Jogo encerrado!");
		
	}

}
