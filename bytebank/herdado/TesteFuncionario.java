
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("111.222.333-44");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		

	}

}
