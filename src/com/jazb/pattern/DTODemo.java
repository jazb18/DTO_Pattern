package com.jazb.pattern;

public class DTODemo {

	public static void main(String...strings){
		
		ClienteBO clienteBusinessObject = new ClienteBO();
		ClienteVO cliente = new ClienteVO(); 
		
		cliente.setId(01);
		cliente.setNombre("Jose");
		cliente.setApellido("Zafra");
				
		clienteBusinessObject.grabarCliente(cliente);
		
		System.out.println( " Buscar Cliente :  " + clienteBusinessObject.buscarCliente(00).getNombre());
		
		clienteBusinessObject.listarClientes().forEach(System.out::println);
	}
}
