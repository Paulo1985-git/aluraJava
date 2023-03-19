package bytebank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(123);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
				
		conta.setTitular(paulo);
		
		
	}

}
