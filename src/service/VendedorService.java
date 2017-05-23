package service;

import java.util.ArrayList;

import dao.ClienteDAO;
import model.Cliente;

public class VendedorService {
	ClienteDAO dao;

	public VendedorService() {
		dao = new ClienteDAO();
	}

	public ArrayList<Cliente> listarClientes() throws ClassNotFoundException {
		return dao.listarClientes();
	}

	public ArrayList<Cliente> listarClientes(String chave) throws ClassNotFoundException {
		return dao.listarClientes(chave);
	}
}