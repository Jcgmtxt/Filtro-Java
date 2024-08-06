package persistence.IModel;

import entity.Course;
import persistence.CRUD.*;

public interface ICourse extends ICreate<Course>,
        IReadAll<Course>,
        IReadModel<Course>,
        IUpdate<Course>,
        IDelete<Integer> {
}
