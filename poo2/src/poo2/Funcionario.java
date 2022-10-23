package poo2;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private Integer nrRegistro;
	private LocalDate dataContratacao;

	public Funcionario() {

	}

	public void pedirDemissao() {
		System.out.println("Funcionario demitido");
	}

	public void serContratado() {
		System.out.println("Funcionario contratado");
	}

	public Integer getNrRegistro() {
		return nrRegistro;
	}

	public void setNrRegistro(Integer nrRegistro) {
		this.nrRegistro = nrRegistro;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

}
