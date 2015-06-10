package ji.restaurant.menu.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>03/06/2015</b>
 * <b>clase que representa la llave compuesta de la entidad <code>Promocion</code></b>
 * @author Ivan
 * @version 1.0
 */
@Embeddable
public class LLavePromocion implements Serializable{

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -4316698357103623482L;
    
	/**
	 * id autogenerado
	 */
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int promocion;
	
	/**
	 * Codigo autogenerado
	 */
	private String codigo;

	/**
	 * Constructor por defecto
	 */
	public LLavePromocion(){
		
	}
	
	
	/**
	 * Constructor con el codigo
	 * @param codigoP
	 */
	public LLavePromocion(String codigoP){
		this.codigo = codigoP;
	}
	
	/**
	 * Devuelve el valor de: promocion
	 * @return  promocion
	 */
	public int getPromocion() {
		return promocion;
	}

	/**
	 *Establece el valor de promocion 
	 * con @param promocion 
	 */
	public void setPromocion(int promocion) {
		this.promocion = promocion;
	}

	/**
	 * Devuelve el valor de: codigo
	 * @return  codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 *Establece el valor de codigo 
	 * con @param codigo 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + promocion;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}	
		if (getClass() != obj.getClass()){
			return false;
		}	
		LLavePromocion other = (LLavePromocion) obj;
		
		if (codigo == null) {
			if (other.codigo != null){
				return false;}
		} else if (!codigo.equals(other.codigo)){
			return false;}
		if (promocion != other.promocion){
			return false;}
		
		return true;
	}
}
