package de.featjar.bin.sharpsat;

import de.featjar.util.bin.Binary;
import de.featjar.util.bin.OperatingSystem;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class SharpSatBinary extends Binary {
    public SharpSatBinary() {
    }

    @Override
    public Path getPath() {
        if (OperatingSystem.IS_WINDOWS)
            return BINARY_DIRECTORY.resolve("sharpSAT.exe");
        else
            return BINARY_DIRECTORY.resolve("sharpSAT");
    }

    @Override
    public Set<Path> getResourcePaths() {
        if (OperatingSystem.IS_WINDOWS)
            return Set.of(Paths.get("bin/sharpSAT.exe"), Paths.get("bin/gmp-10.dll"));
        else
            return Set.of(Paths.get("bin/sharpSAT"));
    }
}
