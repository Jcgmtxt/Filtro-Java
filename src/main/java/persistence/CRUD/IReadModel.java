package persistence.CRUD;

public interface IReadModel<Entity> {
    public Entity read(Entity object);
}

