package pro.philimonov.showcase;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemTaskRepository implements TaskRepository {

    private final List<Task> tasks = new LinkedList<>(){{
        this.add(new Task("first task"));
        this.add(new Task("second task"));
    }};

    @Override
    public List<Task> findAll() {
        return this.tasks;
    }
}
