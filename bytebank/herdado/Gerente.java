//gerente herda da classe funcionario
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
			
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getSalario();
	}
	


}
