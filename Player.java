package capitulo1.guessingGame;

import java.util.ArrayList;

public class Player {

	private String nome;

	static ArrayList<Integer> numChutados = new ArrayList<>();
	
	int[] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	
	Integer chute;

	public Player(String nome) {
		this.nome = nome;
	}

	public void verificaChute() {
		Integer chuteAtual = (int) (Math.random() * 21);
		if (!numChutados.contains(chuteAtual)) {
			numChutados.add(chuteAtual);
			this.chute = chuteAtual;
		} else {
			verificaChute();
		}
	}
	
	public Integer chuta() {
		verificaChute();
		return this.chute;
	}

	public boolean verificaChute(Integer chuteAtual) {
		return false;
	}

	public String getNome() {
		return this.nome;
	}

}
