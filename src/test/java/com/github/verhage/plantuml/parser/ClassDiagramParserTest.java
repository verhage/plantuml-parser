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
        int parseErrors = 0;
        for (ClassDiagram classDiagram : ClassDiagram.values()) {
            parseErrors += parseClassDiagram(classDiagram);
        }

        Assertions.assertEquals(0, parseErrors);
    }

    private int parseClassDiagram(ClassDiagram classDiagram) {
        System.out.println("Parsing " + classDiagram.getPath());
        ClassDiagramLexer lexer = new ClassDiagramLexer(CharStreams.fromString(loadPuml(classDiagram)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClassDiagramParser parser = new ClassDiagramParser(tokens);
        parser.uml();

        return parser.getNumberOfSyntaxErrors();
    }

    private String loadPuml(ClassDiagram classDiagram) {
        try {
            return IOUtils.resourceToString(classDiagram.getPath(), UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
