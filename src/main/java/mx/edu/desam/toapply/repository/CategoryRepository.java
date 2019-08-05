package mx.edu.desam.toapply.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.edu.desam.toapply.entity.Category;
 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{ 
	@Query(value="select * from playit.category  where id_User= :idUserp order by id_Category, id_origin_category", nativeQuery=true)
	List<Category> findCategoryByUser(@Param("idUserp") Integer idUserp);
}
