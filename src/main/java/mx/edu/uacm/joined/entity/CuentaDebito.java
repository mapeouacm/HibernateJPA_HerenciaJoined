package mx.edu.uacm.joined.entity;

import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class CuentaDebito extends Cuenta implements Serializable {

	
	private double cargoPorDescubierto;
	private static final long serialVersionUID = 1L;

	public CuentaDebito() {
		super();
	}   
	public double getCargoPorDescubierto() {
		return this.cargoPorDescubierto;
	}

	public void setCargoPorDescubierto(double cargoPorDescubierto) {
		this.cargoPorDescubierto = cargoPorDescubierto;
	}
   
}