package se.iuh.jpaExample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.iuh.jpaExample.model.TacGia;
@Repository
public interface TacGiaRepository extends CrudRepository<TacGia, String> {

}
