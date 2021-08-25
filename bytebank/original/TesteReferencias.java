package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100 ;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Contas diferentes");
		}
		

	}

}
