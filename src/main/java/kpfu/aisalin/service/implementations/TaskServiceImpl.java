package kpfu.aisalin.service.implementations;

import kpfu.aisalin.dao.TaskDAO;
import kpfu.aisalin.model.Task;
import kpfu.aisalin.service.interfaces.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDAO taskDAO;

    @Override
    public Task getTaskById(long id) {
        return taskDAO.findOne(id);
    }
}
