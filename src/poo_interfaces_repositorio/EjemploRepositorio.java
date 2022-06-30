package poo_interfaces_repositorio;

import java.util.List;

import poo_interfaces_Modelo.Cliente;

public class EjemploRepositorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrudRepositorio repo = new ClienteListRepositorio();
		repo.crear(new Cliente("David", "Quesada"));
		repo.crear(new Cliente("Luis", "Pérez"));
		repo.crear(new Cliente("Juan", "Cabsas"));
		
		List<Cliente> cliente = repo.listar();
		System.out.println();
		
	}

}
