package main.entity;

import org.bukkit.Location;

import java.util.Optional;

public interface DellunaPet {
    enum PetState {
        DEAD, ALIVE, DESPAWNED
    }

    enum SpawnFlags {
        SUCCESS, FAIL
    }

    SpawnFlags spawnEntity();

    void removeEntity();

    void removeEntity(boolean hasRespawnFlag);

    PetState getState();

    void setState(PetState state);

    Optional<Location> getLocation();

    double getMaxHealth();

    void setMaxHealth(double hp);

    double getDamage();

    void setDamage(double dmg);


}