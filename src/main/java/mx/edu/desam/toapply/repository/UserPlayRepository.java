package mx.edu.desam.toapply.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.desam.toapply.entity.UserPlay;
 

public interface UserPlayRepository extends CrudRepository<UserPlay, Integer>{
//	List<Aplicacion> findByLastName(String lastName);
}
