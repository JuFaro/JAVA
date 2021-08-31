
public class CalculadoraDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImporto();
		this.totalImposto += valor;
		
	}
	
	public double getTotalImpoto() {
		return totalImposto;
	}

}
