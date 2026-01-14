package io.github.jristretto.streamprocessor;

import java.util.List;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Helper to define logger.
 *
 * @author Pieter van den Hombergh {@code <pieter.van.den.hombergh@gmail.com>}
 */
public class ProcessorTestBase {

    final Logger logger = LoggerFactory.getLogger(Processor.class);

    ProcessorFactory newProcessorFactory() {
        return new ProcessorFactory( logger );
    }
    
}
