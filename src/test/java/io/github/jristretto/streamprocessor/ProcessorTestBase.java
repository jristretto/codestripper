package io.github.jristretto.streamprocessor;

import cslogger.CSLogger;
import cslogger.StdioLogger;


/**
 * Helper to define logger.
 *
 * @author Pieter van den Hombergh {@code <pieter.van.den.hombergh@gmail.com>}
 */
public class ProcessorTestBase {

    final CSLogger logger = new StdioLogger();

    ProcessorFactory newProcessorFactory() {
        return new ProcessorFactory( logger );
    }
    
}
