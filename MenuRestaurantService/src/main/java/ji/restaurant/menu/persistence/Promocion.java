package ji.restaurant.menu.persistence;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/06/2015</b>
 * <b>representa las promociones en la base de datos</b>
 * @author Ivan
 * @version 1.0
 */
@Entity
@Table(name="Promocion")
public class Promocion implements Serializable {

	/**
	 * Constructor por defecto
	 */
	public Promocion() {
		
	}

	
    /**
     *
	 * Constructor con id 
     * @param id 
     */
    public Promocion(LLavePromocion id) {
	  this.llave = id;	
	}
	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = 624340821743940875L;

	/**
	 * Id compuesto de la entidad
	 */
	@Id
	private LLavePromocion llave;
	
	/**
	 * Define el procentaje o rebaja al monto de un combo en particular
	 */
	@Column(name="porcentaje" )
	@NotEmpty(message="Es necesario definir el porcentaje de la promocion")
	private float porcentaje;
	
	/**
	 * Describe la promoción
	 */
	@Column(name="descripcion" )
	@NotEmpty(message="Es necesario definir la promocion")
	private String descripcion;
	
	/**
	 * Define la fecha de vencimiento
	 */
	@Column(name="fechaVencimiento" )
	private Date fechaVencimiento;
	
	/**
	 * Define si la promoci{on esta vigente o no
	 */
	@Column(name="promocionVencida" )
	private boolean promocionVencida;
}
