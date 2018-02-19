package kpfu.aisalin.dao;

import kpfu.aisalin.model.Message;
import kpfu.aisalin.model.UserInf;
import org.springframework.data.repository.CrudRepository;

public interface MessageDAO extends CrudRepository<Message, Long> {
}
