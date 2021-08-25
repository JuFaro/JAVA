package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuSacar = contaDoPaulo.saca(5);
		System.out.println(conseguiuSacar+" "+contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTranferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if(sucessoTranferencia) {
			System.out.println("Tranferencia feita com sucesso");
			
		}else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
	}

}
