package unicap.uber.view;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Cliente c2 = Cliente.euMesmo;
		//Cliente c2 = new Cliente (null);
		c2.setNome("queijo novo");
		
		Thread t = new Thread (new AlteradorDeCliente());
		t.start();
		Thread.sleep(2000);
		System.out.println(c2.getNome());
	}
}
