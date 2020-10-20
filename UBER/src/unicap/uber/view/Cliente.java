package unicap.uber.view;

public class Cliente {

	private String nome;
	
	static public String sobrenome =  "Pires";
	
	static public Cliente euMesmo = new Cliente(null);
	
	protected Cliente(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static String sobrenome() {
		return sobrenome;
	}
	
	public static void main(String[] args) {
		Cliente c1 = Cliente.euMesmo;
		Cliente c2 = Cliente.euMesmo;
		c1.setNome("outro Neto");
		c1.setNome("mais um Neto");
		c1.sobrenome = "Outro Sobrenome";
		Cliente.sobrenome = "Mais Um Sobrenome";
		System.out.println(c1.getNome());
		System.out.println(c2.getNome());
		System.out.println(c1.sobrenome());
		System.out.println(c2.sobrenome());
		System.out.println(Cliente.sobrenome());
	}
}
