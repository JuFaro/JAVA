
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel g2 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Merco Polo");
		g1.setCpf("888.999.000-33");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(1234);		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
