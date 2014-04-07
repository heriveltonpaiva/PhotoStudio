package br.unirn.dominio;

import java.util.Arrays;
import java.util.Date;

public class Foto {
	
   private String descricao;
   private double valor;
   private byte[] arquivo;
   private Date dataUpload;
   private String legenda;
   
   public Foto() {
	// TODO Auto-generated constructor stub
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public byte[] getArquivo() {
	return arquivo;
}

public void setArquivo(byte[] arquivo) {
	this.arquivo = arquivo;
}

public Date getDataUpload() {
	return dataUpload;
}

public void setDataUpload(Date dataUpload) {
	this.dataUpload = dataUpload;
}

public String getLegenda() {
	return legenda;
}

public void setLegenda(String legenda) {
	this.legenda = legenda;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Arrays.hashCode(arquivo);
	result = prime * result
			+ ((dataUpload == null) ? 0 : dataUpload.hashCode());
	result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
	result = prime * result + ((legenda == null) ? 0 : legenda.hashCode());
	long temp;
	temp = Double.doubleToLongBits(valor);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Foto other = (Foto) obj;
	if (!Arrays.equals(arquivo, other.arquivo))
		return false;
	if (dataUpload == null) {
		if (other.dataUpload != null)
			return false;
	} else if (!dataUpload.equals(other.dataUpload))
		return false;
	if (descricao == null) {
		if (other.descricao != null)
			return false;
	} else if (!descricao.equals(other.descricao))
		return false;
	if (legenda == null) {
		if (other.legenda != null)
			return false;
	} else if (!legenda.equals(other.legenda))
		return false;
	if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
		return false;
	return true;
}
   
   
   
	

}
