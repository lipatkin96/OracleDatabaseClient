package ru.nsu.fit.g14201.lipatkin.model;

import com.sun.istack.internal.NotNull;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.sql.Ref;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * Created by SPN on 05.06.2017.
 */

//TODO: may be need to do hierarchy of constraints to encapsulate sql command message
public class Constraint {
    public enum Type {
        PRIMARY_KEY,
        FOREIGN_KEY
        //TODO: add Not Null
    }
    Type type;
    Reference reference;
    String name;
    {
        reference = null;
    }

    private Constraint(Type type1) {
        type = type1;
    }

    public Constraint(Type type1, String name1) {
        this(type1);
        name = name1;
    }

    void setReference(Reference ref) {
        reference = ref;
    }

    void copy(Constraint constraint) {
        reference = constraint.reference;
        type = constraint.type;
        name = constraint.name;
    }

    public final Type getType() { return type; }
    public final Reference getReference() { return reference; }
    @NotNull
    public final String getName() { return name; }

    @Override
    public boolean equals(Object obj) {
        return (type == ((Constraint)obj).type);
    }
}
