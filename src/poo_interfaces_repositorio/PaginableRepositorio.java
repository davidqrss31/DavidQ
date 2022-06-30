package poo_interfaces_repositorio;

import java.util.List;

import poo_interfaces_Modelo.Cliente;

public interface PaginableRepositorio {
	List<Cliente> listar(int desde, int hasta);
}
