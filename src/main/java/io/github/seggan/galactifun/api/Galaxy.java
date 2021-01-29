package io.github.seggan.galactifun.api;

import io.github.seggan.galactifun.core.Registry;
import lombok.Getter;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A galaxy filled with star systems
 *
 * @author Mooy1
 *
 */
@Getter
public class Galaxy {
    
    private final String name;
    private final List<StarSystem> systems;
    
    public Galaxy(@Nonnull String name, @Nonnull StarSystem... systems) {
        this.systems = new ArrayList<>(Arrays.asList(systems));
        this.name = name;
        Registry.register(this);
    }

    public final void addStarSystems(@Nonnull StarSystem... systems) {
        this.systems.addAll(Arrays.asList(systems));
    }
    
}
