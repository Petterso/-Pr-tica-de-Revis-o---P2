package poo2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Cliente> gCliente = new ArrayList<>();
		ArrayList<Funcionario> gFuncionario = new ArrayList<>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cliente1");
		cliente1.setSaldo(10.00);
		gCliente.add(cliente1);
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Cliente2");
		cliente2.setSaldo(20.00);
		gCliente.add(cliente2);
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Funcionario1");
		gFuncionario.add(funcionario1);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Funcionario2");
		gFuncionario.add(funcionario2);

		gCliente.get(1).depositar(10.00);
		gCliente.get(1).sacar(6.00);
		gCliente.get(1).mostrarSaldo();

		for (Funcionario a : gFuncionario) {
			System.out.println(a.getNome());
		}
		for (Cliente b : gCliente) {
			System.out.println(b.getNome());
		}
	}

}
