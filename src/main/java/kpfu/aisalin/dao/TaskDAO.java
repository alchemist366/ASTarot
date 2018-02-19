package kpfu.aisalin.dao;

import kpfu.aisalin.model.Task;
import kpfu.aisalin.model.UserInf;
import org.springframework.data.repository.CrudRepository;

public interface TaskDAO extends CrudRepository<Task, Long> {
}
