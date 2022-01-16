package de.jknowledge.domain;

import java.util.UUID;

public abstract class EntityBase implements  IDomainEntity {

    protected String id;

    protected EntityBase() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
}
