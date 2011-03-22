package org.bukkit.persistence;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.persistence.dao.MigrationStep;

public class MigrationInfo {
    protected List<MigrationStep> steps = null;

    public MigrationInfo() {}

    public MigrationInfo(PersistedClass entityClass, Migrate info) {
        if (info.steps() != null) {
            steps = new ArrayList<MigrationStep>();
            for (MigrateStep stepInfo : info.steps()) {
                MigrationStep step = new MigrationStep(entityClass, stepInfo);
                steps.add(step);
            }
        }
    }

    public List<MigrationStep> getSteps() {
        return steps;
    }
}
