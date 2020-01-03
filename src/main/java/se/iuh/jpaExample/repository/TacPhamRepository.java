package se.iuh.jpaExample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.iuh.jpaExample.model.TacGia;
import se.iuh.jpaExample.model.TacPham;

@Repository
public interface TacPhamRepository extends CrudRepository<TacPham, String> {
}
