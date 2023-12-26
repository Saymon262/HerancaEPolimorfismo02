package entities;

public class PessoasFisica extends Pessoa {

	private Double gastos;
	
	public PessoasFisica() {
	}
	
	public PessoasFisica(String name, Double income, Double gastos) {
		super(name, income);
		this.gastos = gastos;
	}

		public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}
	
	public Double imposto() {
		if (income < 20000.0) {
			income = (income * 0.15);
		} else {
			income = (income * 0.25);
		}
		
		if (gastos > 0) {
			income -= (gastos/2);
		}
		return income;
	}
	
	@Override
	public String total() {
		return "Name: " + getName() + 
				" R$ " + String.format("%.2f", imposto());

	}
	
	
}
