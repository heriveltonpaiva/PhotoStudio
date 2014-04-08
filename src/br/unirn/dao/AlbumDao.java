package br.unirn.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unirn.dominio.Album;
import br.unirn.factory.Conexao;

public class AlbumDao{

private Connection conexao;
	
	
	public AlbumDao() {
	try {
		this.conexao = Conexao.getConexao();
		
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	   	
	}

	
	public void Adicionar(Album album) throws SQLException {
		
		String sql ="INSERT INTO album VALUES(4,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
        String data = String.format("dd/MM/yyyy",album.getData());
        stmt.setString(1, album.getNome());
        stmt.setString(3, album.getNome());
            
        stmt.execute();
        stmt.close();
       
	}

	public void Atualizar(Album album) {
		
		
		
	}

	public void Deletar(Album album) {
		
		
	}

	public List<Album> getList() throws SQLException {

		    String sql = "SELECT*FROM album";
	        PreparedStatement stmt = this.conexao.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        // criando arraylist 
	        List<Album> lista = new ArrayList<Album>();
	      
	        while (rs.next()) {
	            Album novoAlbum = new Album();

	            novoAlbum.setNome(rs.getString("nome"));
	            novoAlbum.setData(rs.getDate("data"));
	            novoAlbum.setDescricao(rs.getString("descricao"));
	      
	            // adicionando na lista
	            lista.add(novoAlbum);
	        }
	        rs.close();
	        stmt.close();
		
		return lista;
	}
	
}
