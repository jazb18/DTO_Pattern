package com.jazb.pattern;

import java.util.ArrayList;
import java.util.List;


public class ClienteBO {

	List<ClienteVO> clientes;
	
	public void grabarCliente(ClienteVO clienteVO){
		clientes = new ArrayList<>();
		clientes.add(clienteVO);
		
		System.out.println(" Id : " + clienteVO.getId());
		System.out.println(" Tamaño del arreglo : " + clientes.size());
	}
	
	public ClienteVO buscarCliente(int id){
		return clientes.get(id);
	}
	
	public List<ClienteVO> listarClientes(){
		return  clientes;
	}
	
	public void actualizarCliente(ClienteVO cliente){
		clientes.get(cliente.getId()).setNombre(cliente.getNombre());
		clientes.get(cliente.getId()).setApellido(cliente.getApellido());
	}
	
	public void eliminarCliente(int id){
		clientes.remove(id);
	}
	
}
