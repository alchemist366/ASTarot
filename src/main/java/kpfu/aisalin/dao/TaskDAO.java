package kpfu.aisalin.dao;

import kpfu.aisalin.model.Task;
import kpfu.aisalin.model.UserInf;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDAO extends CrudRepository<Task, Long> {

}
