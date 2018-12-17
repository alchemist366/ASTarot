package kpfu.aisalin.dao;

import kpfu.aisalin.model.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectDAO extends CrudRepository<Project, Long> {
//    @Query("SELECT * FROM Test WHERE id = :id")
//    List<Project> getProjectBy(long id);
}
