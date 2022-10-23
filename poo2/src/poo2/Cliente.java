package poo2;

public class Cliente extends Pessoa {

	private Integer nrConta;
	private Double saldo = (double) 0;

	public Cliente(){

	}
	
	public Double sacar(Double a) {
		if (saldo > a) {
			System.out.println("Você sacou R$ " + a );
			this.setSaldo((saldo - a));
			return 1.0;
		} else {
			System.out.println("Saldo insuficiente");
			return 0.0;
		}
	}

	public Double depositar(Double b) {
		System.out.println("Você depositou R$ " + b );
		this.setSaldo((saldo + b));
		return 1.0;
	}

	public Double mostrarSaldo() {
		System.out.println("Seu saldo é R$ "+ this.getSaldo());
		return 1.0;
	}

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
