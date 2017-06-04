package ru.nsu.fit.g14201.lipatkin.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by castiel on 02.05.2017.
 */
public interface SQLCommander {

    /*-----------------Entries edit----------------*/

    public void deleteRow(Entity entity, int rowIndex);

    public void insertRow(Entity entity, List<String> row) throws UpdateException;

    public void update(Entity entity, int rowIndex, String columnName, String newValue) throws UpdateException;

    /*-----------------Entity construct (destruct)----------------*/

    //public void deleteEntity(Entity entity);

    public void renameColumn(Entity entity, Column column, String newName) throws UpdateException;

    public void setColumnType(Entity entity, Column column, String newType) throws UpdateException;

    /*-----------------Getters----------------*/

    public List<String> getAllEntityNames();

    public Entity getEntity(String tableName);

    public List<Entity> getAllEntities();

//    public void close();
}
