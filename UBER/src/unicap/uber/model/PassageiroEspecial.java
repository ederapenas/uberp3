package unicap.uber.model;

public class PassageiroEspecial extends Usuario implements IPassageiro {


	protected float pontos;
	
	public PassageiroEspecial(String nome, int telefone) {
		super();
		setNome(nome);
		setTelefone(telefone);
		pontos = 0;
	}
	
	public setPontos(){
		this.pontos++;
	}
	
	public getPontos(){
		return this.pontos;
	}
	
	@Override
	public String toString() {
		return "Passageiro "+ getNome() + "\nPontos: " + getPontos();
	}
}
