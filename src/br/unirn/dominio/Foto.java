/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unirn.dominio;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HERIVELTON
 */
@Entity
@Table(name = "foto")
@NamedQueries({
    @NamedQuery(name = "Foto.findAll", query = "SELECT f FROM Foto f"),
    @NamedQuery(name = "Foto.findByIdFoto", query = "SELECT f FROM Foto f WHERE f.idFoto = :idFoto"),
    @NamedQuery(name = "Foto.findByDescricao", query = "SELECT f FROM Foto f WHERE f.descricao = :descricao"),
    @NamedQuery(name = "Foto.findByValor", query = "SELECT f FROM Foto f WHERE f.valor = :valor"),
    @NamedQuery(name = "Foto.findByArquivo", query = "SELECT f FROM Foto f WHERE f.arquivo = :arquivo"),
    @NamedQuery(name = "Foto.findByDataUpload", query = "SELECT f FROM Foto f WHERE f.dataUpload = :dataUpload"),
    @NamedQuery(name = "Foto.findByObs", query = "SELECT f FROM Foto f WHERE f.obs = :obs")})
public class Foto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_foto")
    private Integer idFoto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private BigInteger valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "arquivo")
    private long arquivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "data_upload")
    private String dataUpload;
    @Size(max = 255)
    @Column(name = "obs")
    private String obs;
    @JoinColumn(name = "id_fotografo_fotografo", referencedColumnName = "id_fotografo")
    @ManyToOne
    private Fotografo idFotografoFotografo;
    @JoinColumn(name = "id_carrinho_carrinho", referencedColumnName = "id_carrinho")
    @ManyToOne
    private Carrinho idCarrinhoCarrinho;
    @JoinColumn(name = "id_album_album", referencedColumnName = "id_album")
    @ManyToOne
    private Album idAlbumAlbum;

    public Foto() {
    }

    public Foto(Integer idFoto) {
        this.idFoto = idFoto;
    }

    public Foto(Integer idFoto, String descricao, BigInteger valor, long arquivo, String dataUpload) {
        this.idFoto = idFoto;
        this.descricao = descricao;
        this.valor = valor;
        this.arquivo = arquivo;
        this.dataUpload = dataUpload;
    }

    public Integer getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Integer idFoto) {
        this.idFoto = idFoto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigInteger getValor() {
        return valor;
    }

    public void setValor(BigInteger valor) {
        this.valor = valor;
    }

    public long getArquivo() {
        return arquivo;
    }

    public void setArquivo(long arquivo) {
        this.arquivo = arquivo;
    }

    public String getDataUpload() {
        return dataUpload;
    }

    public void setDataUpload(String dataUpload) {
        this.dataUpload = dataUpload;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Fotografo getIdFotografoFotografo() {
        return idFotografoFotografo;
    }

    public void setIdFotografoFotografo(Fotografo idFotografoFotografo) {
        this.idFotografoFotografo = idFotografoFotografo;
    }

    public Carrinho getIdCarrinhoCarrinho() {
        return idCarrinhoCarrinho;
    }

    public void setIdCarrinhoCarrinho(Carrinho idCarrinhoCarrinho) {
        this.idCarrinhoCarrinho = idCarrinhoCarrinho;
    }

    public Album getIdAlbumAlbum() {
        return idAlbumAlbum;
    }

    public void setIdAlbumAlbum(Album idAlbumAlbum) {
        this.idAlbumAlbum = idAlbumAlbum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFoto != null ? idFoto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foto)) {
            return false;
        }
        Foto other = (Foto) object;
        if ((this.idFoto == null && other.idFoto != null) || (this.idFoto != null && !this.idFoto.equals(other.idFoto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dominio.Foto[ idFoto=" + idFoto + " ]";
    }
    
}
