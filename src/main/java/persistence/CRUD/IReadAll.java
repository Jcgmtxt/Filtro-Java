package persistence.CRUD;

import java.util.ArrayList;

public interface IReadAll<Entity> {
    public ArrayList<Entity> read();
}
