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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByIdContatoContato", query = "SELECT c FROM Cliente c WHERE c.idContatoContato = :idContatoContato"),
    @NamedQuery(name = "Cliente.findByIdUsuario", query = "SELECT c FROM Cliente c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByDataNascimento", query = "SELECT c FROM Cliente c WHERE c.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Cliente.findByFoto", query = "SELECT c FROM Cliente c WHERE c.foto = :foto"),
    @NamedQuery(name = "Cliente.findByLogin", query = "SELECT c FROM Cliente c WHERE c.login = :login"),
    @NamedQuery(name = "Cliente.findBySenha", query = "SELECT c FROM Cliente c WHERE c.senha = :senha"),
    @NamedQuery(name = "Cliente.findByIdEnderecoEndereco", query = "SELECT c FROM Cliente c WHERE c.idEnderecoEndereco = :idEnderecoEndereco")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_contato_contato")
    private Integer idContatoContato;
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
    @OneToMany(mappedBy = "idClienteCliente")
    private List<Fotografocliente> fotografoclienteList;
    @JoinColumn(name = "id_carrinho_carrinho", referencedColumnName = "id_carrinho")
    @OneToOne
    private Carrinho idCarrinhoCarrinho;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, int idUsuario, String nome, String cpf, Date dataNascimento, String login, String senha) {
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdContatoContato() {
        return idContatoContato;
    }

    public void setIdContatoContato(Integer idContatoContato) {
        this.idContatoContato = idContatoContato;
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

    public List<Fotografocliente> getFotografoclienteList() {
        return fotografoclienteList;
    }

    public void setFotografoclienteList(List<Fotografocliente> fotografoclienteList) {
        this.fotografoclienteList = fotografoclienteList;
    }

    public Carrinho getIdCarrinhoCarrinho() {
        return idCarrinhoCarrinho;
    }

    public void setIdCarrinhoCarrinho(Carrinho idCarrinhoCarrinho) {
        this.idCarrinhoCarrinho = idCarrinhoCarrinho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.dominio.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
