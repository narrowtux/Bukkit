package org.bukkit.persistence;

public interface PersistedReference {
    public String getName();

    public PersistedClass getReferenceType();

    public Class<?> getType();

    public boolean isObject();
}
