package de.htw.mobileaw.storage;

import java.util.List;

public interface Storage<T> {

    /** Add object to storage */
    public void add(T object);

    /** Remove object from storage */
    public void remove(T object);

    /** get all stored objects
     * @return List with all stored objects */
    public List<T> getAll();

    /** get one object with id
     * @param id of object
     * @return returns object */
    public T get(int id);

}
