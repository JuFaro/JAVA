
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 65;
		int quantidadePessoa = 1;
		if (idade>=18) { 
			System.out.println("Você é Maior de Idade");
		}else {
			if(quantidadePessoa>=2) {
				System.out.println("Você é de Menor, porém pode entrar");
			}else
			System.out.println("Você é Menor de Idade");
		}

	}

}
