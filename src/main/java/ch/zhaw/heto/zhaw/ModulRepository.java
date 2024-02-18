package ch.zhaw.heto.zhaw;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModulRepository extends CrudRepository<Modul, Long> {
}
