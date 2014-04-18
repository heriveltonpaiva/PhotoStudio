package br.unirn.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.dominio.service.AlbumService;
import br.unirn.dominio.Album;

@SessionScoped
@ManagedBean
public class AlbumBean {

	private Album album;
	
	public AlbumBean(){
		album = new Album();
		
	}
	public Album getAlbum() {
		return album;
	}
	
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
	
	public void salvar(){
		
		AlbumService n = new AlbumService();
		
		n.adicionarAlbum(album);
	}
	
	
}
