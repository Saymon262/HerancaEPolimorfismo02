package entities;

public class PessoaJuridica extends Pessoa {

	private Integer employees;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	public Double imposto() {
		if (employees > 10) {
			income = income*0.14;
		} else {
			income = income*0.16;
		}	
		return income;
	}
	
	@Override
	public String total() {
		return "Name: " + getName() + 
				" R$ " + String.format("%.2f", imposto());
	}
}
	
