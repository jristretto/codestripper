/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package io.github.jristretto.codestripper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.github.jristretto.streamprocessor.ProcessorFactory;

/**
 *
 * @author Pieter van den Hombergh {@code <pieter.van.den.hombergh@gmail.com>}
 */
public class RoadKillTest extends StripperTestBase {

    public RoadKillTest() {
    }
    //cs:comment:start
    //@Disabled("think TDD")
    @Test @DisplayName( "ensure stripper strips" )
    public void testEnsureThatStripperFactoryStrips() throws IOException {
        var lines = Files.lines( Path.of( "src",
                "test",
                "java",
                "io",
                "github",
                "jristretto",
                "codestripper",
                "StripperRoadKill.java" ) ).toList();
        var factory = new ProcessorFactory( this.log );

        int sumIn = lines.stream().mapToInt( String::length ).sum();
        System.out.println( "sumIn = " + sumIn );
        List<String> stripped = lines.stream()
                .map( factory::apply ) // wrap in recipe
                .flatMap( x -> x ) // flatten the result
                .toList();
        int sumOut = stripped.stream().mapToInt( String::length ).sum();
        System.out.println( "sumOut = " + sumOut );
        assertThat( sumIn ).isGreaterThan( sumOut );

//        fail( "method EnsureThatStripperFactoryStrips reached end. You know what to do." );
    }
    //cs:comment:end
}
