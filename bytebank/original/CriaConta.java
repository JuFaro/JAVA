package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta: "+primeiraConta.saldo);
		System.out.println("Primeira conta: "+primeiraConta.agencia);
		System.out.println("Primeira conta: "+primeiraConta.numero);
		System.out.println("Primeira conta: "+primeiraConta.titular);
		System.out.println("Segunda conta: "+segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Contas diferentes");
		}

	}

}
