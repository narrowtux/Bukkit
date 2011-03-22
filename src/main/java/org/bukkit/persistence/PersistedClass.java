package org.bukkit.persistence;

import org.bukkit.Server;

public interface PersistedClass {
    public EntityInfo getEntityInfo();

    public Object getIdData(Object o);

    public Persistence getPersistence();

    public Server getServer();

    public Class<? extends Object> getType();
}
