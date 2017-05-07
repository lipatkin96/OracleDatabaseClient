package ru.nsu.fit.g14201.lipatkin.model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by SPN on 06.05.2017.
 */
public class Column {
    private String name;
    private String className;
    private int number;     //from 1 to ... (number of column)
    //or public String className;
    private ArrayList<String> elements;

    {
        elements = new ArrayList<>();
    }

    public Column(ResultSetMetaData resultSetMetaData, int columnNumber) throws SQLException {
        number = columnNumber;
        name = resultSetMetaData.getColumnName(columnNumber);
        className = resultSetMetaData.getColumnClassName(columnNumber);
    }

    public void add(ResultSet resultSet) throws SQLException {
        elements.add(resultSet.getString(number));
    }

    public int size() { return elements.size(); }

    public String get(int rowIndex) { return elements.get(rowIndex); }

    public String getName() { return name; }
}