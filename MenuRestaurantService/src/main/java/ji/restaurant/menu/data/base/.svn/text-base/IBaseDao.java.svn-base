package ji.restaurant.menu.data.base;

import java.util.List;


/**
 * <b>REVISION 1.0</b>
 * <br>
 * <b>Fecha:</b>04/06/2015</b>
 * <b>.Interfaz para las funcioes principales CRUD de hibernate</b>
 * @author Ivan
 * @version 1.0
 */
public interface IBaseDao {

	/**
	 * Metodo generico para guardar una entidad
	 * @param entity tabla a guardar
	 */
	<T> void saveEntity(T entity);

	/**
	 * Metodo generico para actualizar una entidad
	 * @param entity tabla con los valores a actualizar
	 */
	<T> void updateEntity(T entity);

	/**
	 * Metodo generico para eliminar una entidad
	 * @param entity tipo de registro a eliminar
	 */
	<T> void deleteEntity(T entity);

	
	/**
	 * Funcion generica para obtener un registro especifico basado en el id
	 * @param id de la entidad a buscar 
	 * @param entity tipo de entidad a buscar
	 * @return Registro buscado o nulo
	 */
	<T> T getEntityById(long id, T entity);

	
	/**
	 * Metodo generica para traer todos los registros de una entidad
	 * @param entity tipo de registros a buscar
	 * @return lista con registros o lsita vacia
	 */
	<T> List<T> findAllEntity(T entity);

}
