package persistence.IModel;

import entity.Qualify;
import persistence.CRUD.ICreate;
import persistence.CRUD.IDelete;
import persistence.CRUD.IReadAll;
import persistence.CRUD.IUpdate;

public interface IQuality extends ICreate<Qualify>,
        IReadAll<Qualify>,
        IUpdate<Qualify>,
        IDelete<Integer> {
}
