package br.unirn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.unirn.dominio.Cliente;
import br.unirn.dominio.Estado;


@ManagedBean(name = "clienteMB")
@SessionScoped
public class ClienteController {

	
	private Cliente cliente;
	private List<Cliente> listaClientes;
	private List<String> estados;
	
	
	
	public ClienteController() {
	
		cliente = new  Cliente();
	listaClientes = new ArrayList<Cliente>();
		// TODO Auto-generated constructor stub
	
	}
	

	public void cadastrar(){
	
		cliente.getNome();

		listaClientes.add(cliente);
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
/**	
	public void save() {
//		ClienteDao.save(cliente);
		cliente = new Cliente();
		}

		public void edit() {
		// pega o parametro passado no link
		Integer id = Integer.parseInt((String)
		FacesContext.getCurrentInstance().getExternalContext()
		.getRequestParameterMap().get("id"));
	//	pessoa = pessoaDao.getById(id);
		}

		public void delete(){
		// pega o parametro passado no link
		Integer id = Integer.parseInt((String)
		FacesContext.getCurrentInstance().getExternalContext()
		.getRequestParameterMap().get("id"));
//		pessoaDao.delete(id);
		}
	
	
	
	/**
	public List<Cliente> getPessoas() {
		return clienteDao.findAll();
		}
		*/
	
	
		
		
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}	
	
	public String getLista(){
		String list ="";
		
		for (Cliente cli : listaClientes) {
			
			list+="Nome: "+cli.getNome()+ "Cep:"+cli.getCep()+" Cidade:"+cli.getCidade();
		}
		
		return list;
	}
	
	public List<String> getEstados() {
		  List<String> estadosList = new ArrayList<String>();  

		  for (Estado e : Estado.values()) {
		   estadosList.add(e.toString());
		  }
		  return estadosList;
		 }

		 public void setEstados(List<String> estados) {
		  this.estados = estados;
		 }
}
