/*
 * Copyright 2026 homberghp {@code <pieter.van.den.hombergh@gmail.com>}.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cslogger;

import java.io.PrintStream;
import java.util.function.Supplier;

/**
 *
 * @author homberghp {@code <pieter.van.den.hombergh@gmail.com>}
 */
public class StdioLogger implements CSLogger {

    private final PrintStream out;
    private static final String errorP = "[\033[31;1mERROR\033[m] ";
    private static final String infoP = "[\033[34;1mINFO\033[m] ";
    private static final String warnP = "[\033[1;33mWARNING\033[37;1m]\033[m ";
    private static final String debugP = "[\033[35;1mDEBUG\033[m] ";
    private static final String fineP = "[\033[32;1mFINER\033[m] ";

    public StdioLogger(PrintStream out) {
        this.out = out;
    }

    public StdioLogger() {
        this.out = System.out;
    }

    @Override
    public void info(Supplier<String> msgSupplier) {
        out.println(infoP + msgSupplier.get());
    }

    @Override
    public void debug(Supplier<String> msgSupplier) {
        out.println(debugP + msgSupplier.get());
    }

    @Override
    public void error(Supplier<String> msgSupplier) {
        out.println(errorP + msgSupplier.get());
    }

    @Override
    public void warn(Supplier<String> msgSupplier) {
        out.println(warnP + msgSupplier.get());
    }
}
