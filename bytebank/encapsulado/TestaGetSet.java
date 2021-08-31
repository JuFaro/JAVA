
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1234, 776543);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("111.222.333-44");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
		conta.getTitular().setProfissao("Web Desing");
		
		System.out.println(conta.getTitular().getProfissao());
		

	}

}
