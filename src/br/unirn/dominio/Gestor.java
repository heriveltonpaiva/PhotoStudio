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
@Table(name = "gestor")
@NamedQueries({
    @NamedQuery(name = "Gestor.findAll", query = "SELECT g FROM Gestor g"),
    @NamedQuery(name = "Gestor.findByIdGestor", query = "SELECT g FROM Gestor g WHERE g.idGestor = :idGestor"),
    @NamedQuery(name = "Gestor.findByIdUsuario", query = "SELECT g FROM Gestor g WHERE g.idUsuario = :idUsuario"),
    @NamedQuery(name = "Gestor.findByNome", query = "SELECT g FROM Gestor g WHERE g.nome = :nome"),
    @NamedQuery(name = "Gestor.findByCpf", query = "SELECT g FROM Gestor g WHERE g.cpf = :cpf"),
    @NamedQuery(name = "Gestor.findByDataNascimento", query = "SELECT g FROM Gestor g WHERE g.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Gestor.findByFoto", query = "SELECT g FROM Gestor g WHERE g.foto = :foto"),
    @NamedQuery(name = "Gestor.findByLogin", query = "SELECT g FROM Gestor g WHERE g.login = :login"),
    @NamedQuery(name = "Gestor.findBySenha", query = "SELECT g FROM Gestor g WHERE g.senha = :senha"),
    @NamedQuery(name = "Gestor.findByIdEnderecoEndereco", query = "SELECT g FROM Gestor g WHERE g.idEnderecoEndereco = :idEnderecoEndereco"),
    @NamedQuery(name = "Gestor.findByIdContatoContato", query = "SELECT g FROM Gestor g WHERE g.idContatoContato = :idContatoContato")})
public class Gestor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_gestor")
    private Integer idGestor;
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
    @Column(name = "id_endereco_endereco")
    private Integer idEnderecoEndereco;
    @Column(name = "id_contato_contato")
    private Integer idContatoContato;
    @OneToMany(mappedBy = "idGestorGestor")
    private List<Fotografo> fotografoList;

    public Gestor() {
    }

    public Gestor(Integer idGestor) {
        this.idGestor = idGestor;
    }

    public Gestor(Integer idGestor, int idUsuario, String nome, String cpf, Date dataNascimento, String login, String senha) {
        this.idGestor = idGestor;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdGestor() {
        return idGestor;
    }

    public void setIdGestor(Integer idGestor) {
        this.idGestor = idGestor;
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

    public Integer getIdEnderecoEndereco() {
        return idEnderecoEndereco;
    }

    public void setIdEnderecoEndereco(Integer idEnderecoEndereco) {
        this.idEnderecoEndereco = idEnderecoEndereco;
    }

    public Integer getIdContatoContato() {
        return idContatoContato;
    }

    public void setIdContatoContato(Integer idContatoContato) {
        this.idContatoContato = idContatoContato;
    }

    public List<Fotografo> getFotografoList() {
        return fotografoList;
    }

    public void setFotografoList(List<Fotografo> fotografoList) {
        this.fotografoList = fotografoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGestor != null ? idGestor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestor)) {
            return false;
        }
        Gestor other = (Gestor) object;
        if ((this.idGestor == null && other.idGestor != null) || (this.idGestor != null && !this.idGestor.equals(other.idGestor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dominio.Gestor[ idGestor=" + idGestor + " ]";
    }
    
}
