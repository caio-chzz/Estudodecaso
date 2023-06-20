package modelo;

import java.time.LocalDate;
import java.util.Date;

import javax.xml.crypto.Data;

public class Voo {
	
	private String destino;
	private Integer horario;
	private Float valor;
	private String data;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Integer getHorario() {
		return horario;
	}
	public void setHorario(Integer horario) {
		this.horario = horario;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
