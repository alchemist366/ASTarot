package kpfu.aisalin.dao;

import kpfu.aisalin.model.Attachment;
import kpfu.aisalin.model.UserInf;
import org.springframework.data.repository.CrudRepository;


public interface AttachmentDAO extends CrudRepository<Attachment, Long> {
}
