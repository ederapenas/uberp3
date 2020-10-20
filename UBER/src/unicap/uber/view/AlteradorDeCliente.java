package unicap.uber.view;

public class AlteradorDeCliente implements Runnable {

	@Override
	public void run() {
		Cliente c2 = Cliente.euMesmo;
		//Cliente c2 = new Cliente (null);
		c2.setNome("alguem mexeu no meu queijo");
	}

}
