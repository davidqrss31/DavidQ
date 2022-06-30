package poo_interfaces_repositorio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import poo_interfaces_Modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {

	private List<Cliente> datasouce; //

	public ClienteListRepositorio() {
		this.datasouce = new ArrayList<>();
	}

	@Override
	public List<Cliente> listar() {

		return null;
	}

	@Override
	public Cliente porId(Integer id) {
		Cliente resultado = null;
		for (Cliente cli : datasouce) {
			if (cli.getId().equals(id)) {
				resultado = cli;
				break;
			}
		}
		return resultado;
	}

	@Override
	public void crear(Cliente cliente) {
		this.datasouce.add(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		Cliente c = this.porId(cliente.getId());
		c.setNombre(cliente.getNombre());
		c.setApellidos(cliente.getApellidos());
	}

	@Override
	public void eliminar(Integer id) {
		Cliente c = porId(id);
		this.datasouce.remove(c);

	}

	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		datasouce.sort((a, b) ->{
				int resultado = 0;
				if (dir == Direccion.ASC) {
					switch (campo) {
					case "id":
						resultado = a.getId().compareTo(b.getId());
					case "nombre":
						resultado = a.getNombre().compareTo(b.getNombre());
					case "apellidos":
						resultado = a.getApellidos().compareTo(b.getApellidos());

					}
				} else if (dir == Direccion.DESC) {
					switch (campo) {
					case "id":
						resultado = b.getId().compareTo(a.getId());
					case "nombre":
						resultado = b.getNombre().compareTo(a.getNombre());
					case "apellidos":
						resultado = b.getApellidos().compareTo(a.getApellidos());

					}

				}
				return resultado;
			});

		return datasouce;
	}

	@Override
	public List<Cliente> listar(int desde, int hasta) {
	
		return datasouce.subList(desde, hasta);
	}

}
