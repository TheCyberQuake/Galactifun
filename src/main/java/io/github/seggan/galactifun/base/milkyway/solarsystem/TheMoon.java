package io.github.seggan.galactifun.base.milkyway.solarsystem;

import io.github.seggan.galactifun.api.Moon;
import io.github.seggan.galactifun.api.attributes.Atmosphere;
import io.github.seggan.galactifun.api.attributes.SolarType;

import javax.annotation.Nonnull;
import java.util.Random;

public class TheMoon extends Moon {

    public TheMoon() {
        super("The Moon", 238_900, -3, 14_600_000L, SolarType.NORMAL, Atmosphere.MOON_LIKE);
    }

    @Override
    protected void generateChunk(@Nonnull ChunkData chunk, @Nonnull Random random, @Nonnull BiomeGrid biome, int chunkX, int chunkZ) {
        
    }

}
