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
public class PromoKey implements Serializable{

	/**
	 * Serial autogenerado
	 */
	private static final long serialVersionUID = -4316698357103623482L;
    
	/**
	 * id autogenerado
	 */
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int promoId;
	
	/**
	 * Codigo autogenerado
	 */
	private String code;

	/**
	 * Constructor por defecto
	 */
	public PromoKey(){
		
	}
	
	
	/**
	 * Constructor con el codeP
	 * @param codeP
	 */
	public PromoKey(String codeP){
		this.code = codeP;
	}
	
	/**
	 * Devuelve el valor de: promoIdP
	 * @return  promoIdP
	 */
	public int getPromoId() {
		return promoId;
	}

	/**
	 *Establece el valor de promoId 
	 * con @param promoIdP 
	 */
	public void setPromoId(int promoIdP) {
		this.promoId = promoIdP;
	}

	/**
	 * Devuelve el valor de: code
	 * @return  code
	 */
	public String getCode() {
		return code;
	}

	/**
	 *Establece el valor de codeP 
	 * con @param codeP 
	 */
	public void setCodigo(String codeP) {
		this.code = codeP;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + promoId;
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
		PromoKey other = (PromoKey) obj;
		
		if (code == null) {
			if (other.code != null){
				return false;}
		} else if (!code.equals(other.code)){
			return false;}
		if (promoId != other.promoId){
			return false;}
		
		return true;
	}
}
