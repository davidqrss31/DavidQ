package poo_interfaces_repositorio;

import java.util.List;

import poo_interfaces_Modelo.Cliente;

public interface OrdenableRepositorio {
	List<Cliente> listar(String campo, Direccion dir);
}
