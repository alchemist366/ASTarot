package kpfu.aisalin.dao;

import kpfu.aisalin.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectDAO extends CrudRepository<Project, Long> {
}
