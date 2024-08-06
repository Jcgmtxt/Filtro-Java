package persistence.IModel;

import entity.Course;
import persistence.CRUD.ICreate;
import persistence.CRUD.IDelete;
import persistence.CRUD.IReadAll;
import persistence.CRUD.IUpdate;

public interface ICourse extends ICreate<Course>,
        IReadAll<Course>,
        IUpdate<Course>,
        IDelete<Integer> {
}
