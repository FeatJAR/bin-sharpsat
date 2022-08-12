package de.featjar.bin.sharpsat;

import de.featjar.util.bin.Binary;
import de.featjar.util.bin.OperatingSystem;

import java.nio.file.Path;
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
    public Set<String> getResourceNames() {
        if (OperatingSystem.IS_WINDOWS)
            return Set.of("sharpSAT.exe", "gmp-10.dll");
        else
            return Set.of("sharpSAT");
    }
}
