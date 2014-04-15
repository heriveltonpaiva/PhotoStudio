/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unirn.dominio;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HERIVELTON
 */
@Entity
@Table(name = "fotografo")
@NamedQueries({
    @NamedQuery(name = "Fotografo.findAll", query = "SELECT f FROM Fotografo f"),
    @NamedQuery(name = "Fotografo.findByIdFotografo", query = "SELECT f FROM Fotografo f WHERE f.idFotografo = :idFotografo"),
    @NamedQuery(name = "Fotografo.findByIdEnderecoEndereco", query = "SELECT f FROM Fotografo f WHERE f.idEnderecoEndereco = :idEnderecoEndereco"),
    @NamedQuery(name = "Fotografo.findByIdUsuario", query = "SELECT f FROM Fotografo f WHERE f.idUsuario = :idUsuario"),
    @NamedQuery(name = "Fotografo.findByNome", query = "SELECT f FROM Fotografo f WHERE f.nome = :nome"),
    @NamedQuery(name = "Fotografo.findByCpf", query = "SELECT f FROM Fotografo f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Fotografo.findByDataNascimento", query = "SELECT f FROM Fotografo f WHERE f.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Fotografo.findByFoto", query = "SELECT f FROM Fotografo f WHERE f.foto = :foto"),
    @NamedQuery(name = "Fotografo.findByLogin", query = "SELECT f FROM Fotografo f WHERE f.login = :login"),
    @NamedQuery(name = "Fotografo.findBySenha", query = "SELECT f FROM Fotografo f WHERE f.senha = :senha"),
    @NamedQuery(name = "Fotografo.findByIdContatoContato", query = "SELECT f FROM Fotografo f WHERE f.idContatoContato = :idContatoContato")})
public class Fotografo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fotografo")
    private Integer idFotografo;
    @Column(name = "id_endereco_endereco")
    private Integer idEnderecoEndereco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "foto")
    private BigInteger foto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "senha")
    private String senha;
    @Column(name = "id_contato_contato")
    private Integer idContatoContato;
    @OneToMany(mappedBy = "idFotografoFotografo")
    private List<Fotografocliente> fotografoclienteList;
    @JoinColumn(name = "id_gestor_gestor", referencedColumnName = "id_gestor")
    @ManyToOne
    private Gestor idGestorGestor;
    @OneToMany(mappedBy = "idFotografoFotografo")
    private List<Album> albumList;
    @OneToMany(mappedBy = "idFotografoFotografo")
    private List<Foto> fotoList;

    public Fotografo() {
    }

    public Fotografo(Integer idFotografo) {
        this.idFotografo = idFotografo;
    }

    public Fotografo(Integer idFotografo, int idUsuario, String nome, String cpf, Date dataNascimento, String login, String senha) {
        this.idFotografo = idFotografo;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdFotografo() {
        return idFotografo;
    }

    public void setIdFotografo(Integer idFotografo) {
        this.idFotografo = idFotografo;
    }

    public Integer getIdEnderecoEndereco() {
        return idEnderecoEndereco;
    }

    public void setIdEnderecoEndereco(Integer idEnderecoEndereco) {
        this.idEnderecoEndereco = idEnderecoEndereco;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigInteger getFoto() {
        return foto;
    }

    public void setFoto(BigInteger foto) {
        this.foto = foto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdContatoContato() {
        return idContatoContato;
    }

    public void setIdContatoContato(Integer idContatoContato) {
        this.idContatoContato = idContatoContato;
    }

    public List<Fotografocliente> getFotografoclienteList() {
        return fotografoclienteList;
    }

    public void setFotografoclienteList(List<Fotografocliente> fotografoclienteList) {
        this.fotografoclienteList = fotografoclienteList;
    }

    public Gestor getIdGestorGestor() {
        return idGestorGestor;
    }

    public void setIdGestorGestor(Gestor idGestorGestor) {
        this.idGestorGestor = idGestorGestor;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public List<Foto> getFotoList() {
        return fotoList;
    }

    public void setFotoList(List<Foto> fotoList) {
        this.fotoList = fotoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFotografo != null ? idFotografo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fotografo)) {
            return false;
        }
        Fotografo other = (Fotografo) object;
        if ((this.idFotografo == null && other.idFotografo != null) || (this.idFotografo != null && !this.idFotografo.equals(other.idFotografo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dominio.Fotografo[ idFotografo=" + idFotografo + " ]";
    }
    
}
