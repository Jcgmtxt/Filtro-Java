package persistence.IModel;

import entity.Student;
import persistence.CRUD.ICreate;
import persistence.CRUD.IReadAll;
import persistence.CRUD.IReadModel;
import persistence.CRUD.IUpdate;

public interface IStudent extends ICreate<Student>,
        IReadAll<Student>,
        IReadModel<Student>,
        IUpdate<Student>
{}
