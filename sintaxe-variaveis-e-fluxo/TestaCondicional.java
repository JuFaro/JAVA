
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 65;
		int quantidadePessoa = 1;
		if (idade>=18) { 
			System.out.println("Voc� � Maior de Idade");
		}else {
			if(quantidadePessoa>=2) {
				System.out.println("Voc� � de Menor, por�m pode entrar");
			}else
			System.out.println("Voc� � Menor de Idade");
		}

	}

}
