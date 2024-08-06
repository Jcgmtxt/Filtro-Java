package persistence.IModel;

import entity.Inscription;
import persistence.CRUD.ICreate;
import persistence.CRUD.IDelete;
import persistence.CRUD.IReadAll;
import persistence.CRUD.IUpdate;

public interface IInscription extends ICreate<Inscription>,
        IReadAll<Inscription>,
        IUpdate<Inscription>,
        IDelete<Integer> {
}

