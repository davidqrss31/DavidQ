package poo_interfaces_repositorio;

import java.util.List;

import poo_interfaces_Modelo.Cliente;

public interface CrudRepositorio {
	List<Cliente> listar();
	Cliente porId(Integer id);
	void crear(Cliente cliente);
	void editar(Cliente cliente);
	void eliminar(Integer id);
}
