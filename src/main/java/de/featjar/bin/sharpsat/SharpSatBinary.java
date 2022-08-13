/*
 * Copyright (C) 2022 Sebastian Krieter, Elias Kuiter
 *
 * This file is part of bin-sharpsat.
 *
 * bin-sharpsat is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3.0 of the License,
 * or (at your option) any later version.
 *
 * bin-sharpsat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with bin-sharpsat. If not, see <https://www.gnu.org/licenses/>.
 *
 * See <https://github.com/FeatJAR/bin-sharpsat> for further information.
 */
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
