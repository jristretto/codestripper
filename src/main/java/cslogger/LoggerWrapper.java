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

import java.util.function.Supplier;

/**
 *
 * @author homberghp {@code <pieter.van.den.hombergh@gmail.com>}
 */
public class LoggerWrapper  implements CSLogger {

    final CSLogger wrappedLogger;
    public LoggerWrapper (CSLogger wrappedLogger) {
        this.wrappedLogger= wrappedLogger;
    }

    @Override
    public void info(Supplier<String> msgSupplier) {
        wrappedLogger.info(msgSupplier);
    }

    @Override
    public void debug(Supplier<String> msgSupplier) {
        wrappedLogger.debug(msgSupplier);
    }

    @Override
    public void error(Supplier<String> msgSupplier) {
        wrappedLogger.error(msgSupplier);
    }

    @Override
    public void warn(Supplier<String> msgSupplier) {
        wrappedLogger.warn(msgSupplier);
    }


}
