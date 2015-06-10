package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/06/2015</b>
 * <b>Representa a la tabla TipoDeOrden en la base de datos  </b>
 * <b>Define si la orden es a domicilio o en el local</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="TipoDeOrden")
public class TipoDeOrden implements Serializable{

	
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -9061459615453779935L;

	/**
	 * identificador del tipo de orden
	 */
	@Id
	private int idTipo;
	
	/**
	 * definicion de tipo de orden (a domicilio o en el local)
	 */
	
	@Column
	@NotEmpty(message="Es necesario definir el tipo de orden")
	private String tipoDeOrden;
	
	/**
	 * Define el coste por el tipo de orden(costo de trasporte o impuesto de servicio)
	 */
	@Column
	private double coste;

	/**
	 * Devuelve el valor de: idTipo
	 * @return  idTipo
	 */
	public int getIdTipo() {
		return idTipo;
	}

	/**
	 *Establece el valor de idTipo 
	 * con @param idTipo 
	 */
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	/**
	 * Devuelve el valor de: tipoDeOrden
	 * @return  tipoDeOrden
	 */
	public String getTipoDeOrden() {
		return tipoDeOrden;
	}

	/**
	 *Establece el valor de tipoDeOrden 
	 * con @param tipoDeOrden 
	 */
	public void setTipoDeOrden(String tipoDeOrden) {
		this.tipoDeOrden = tipoDeOrden;
	}

	/**
	 * Devuelve el valor de: coste
	 * @return  coste
	 */
	public double getCoste() {
		return coste;
	}

	/**
	 *Establece el valor de coste 
	 * con @param coste 
	 */
	public void setCoste(double coste) {
		this.coste = coste;
	}
	
	
	
}
