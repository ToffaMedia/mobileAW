package de.htw.mobileaw.network;

public interface ConnectionService<T> {

    /** start a service that talks to connections */
    public void start();

    /** executes when a object received */
    public T receiveObject();

    /** offers object to all connections */
    public void putObject(T object);

}
