package capitulo1.guessingGame;

public class Player {

	private String nome;

	private static int abrangencia;

	private static int[] numerosPossiveisSaoZeros;
	
	private static int quantosZerosTem;
	
	Integer chute;

	public Player(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public Player(int abrangencia) {
		Player.abrangencia = abrangencia;
		if (Player.abrangencia <= 3)
			throw new RuntimeException("A abrangencia deve ser maior que 3");
		Player.numerosPossiveisSaoZeros = new int[Player.abrangencia];
	}

	public Integer chuta() {
		verificaNumPossivel();
		return this.chute;
	}

	public void verificaNumPossivel() {
		
		Integer chuteAtual = (int) (Math.random() * Player.abrangencia);
		
		for (int i : Player.numerosPossiveisSaoZeros) {
			System.out.print(i);
		}
		System.out.println();
		
		if (numerosPossiveisSaoZeros[chuteAtual] != 0) {
			for (int i = 0; i < Player.abrangencia; i++) {
				if (Player.numerosPossiveisSaoZeros[i] == 0) {
					this.chute = i;
					Player.numerosPossiveisSaoZeros[i] = 1;
					break;
				}
			}
		} else {
			this.chute = chuteAtual;
			numerosPossiveisSaoZeros[chuteAtual] = 1;
		}
	}


}
