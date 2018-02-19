package kpfu.aisalin.dao;

import kpfu.aisalin.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyDAO extends CrudRepository<Company, Long> {

}
