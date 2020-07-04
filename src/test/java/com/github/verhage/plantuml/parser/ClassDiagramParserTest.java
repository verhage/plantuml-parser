package com.github.verhage.plantuml.parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Test parsing of PlantUML class diagrams.
 *
 * @author verhage
 */
public class ClassDiagramParserTest {
    @Test
    public void testParseClassDiagrams() {
        Arrays.stream(ClassDiagram.values()).forEach(this::parseClassDiagram);
    }

    private void parseClassDiagram(ClassDiagram classDiagram) {
        System.out.println("Parsing " + classDiagram.getPath());
        ClassDiagramLexer lexer = new ClassDiagramLexer(CharStreams.fromString(loadPuml(classDiagram)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClassDiagramParser parser = new ClassDiagramParser(tokens);
        parser.uml();

        Assertions.assertEquals(0, parser.getNumberOfSyntaxErrors());
    }

    private String loadPuml(ClassDiagram classDiagram) {
        try {
            return IOUtils.resourceToString(classDiagram.getPath(), UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
