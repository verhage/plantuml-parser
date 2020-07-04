package com.github.verhage.plantuml.parser;

/**
 * Class diagrams used for testing our parser. These diagrams are taken from https://plantuml.com/class-diagram.
 *
 * @author verhage
 */
public enum ClassDiagram {
    CLASSES_1("classes-1.puml"),
    CLASSES_2("classes-2.puml"),
    CLASSES_3("classes-3.puml"),
    LABELS_1("labels-1.puml"),
    LABELS_2("labels-2.puml"),
    METHODS_1("methods-1.puml"),
    METHODS_2("methods-2.puml"),
    METHODS_3("methods-3.puml"),
    VISIBILITY_1("visibility-1.puml"),
    VISIBILITY_2("visibility-2.puml"),
    ABSTRACT_STATIC("abstract-static.puml"),
    ADVANCED_BODY("advanced-body.puml"),
    NOTES_1("notes-1.puml"),
    NOTES_2("notes-2.puml"),
    NOTES_3("notes-3.puml"),
    ABSTRACT_INTERFACE("abstract-interface.puml"),
    NON_LETTERS("non-letters.puml"),
    HIDE_1("hide-1.puml"),
    HIDE_2("hide-2.puml"),
    GENERICS("generics.puml"),
    SPOT("spot.puml"),
    PACKAGES_1("packages-1.puml"),
    PACKAGES_2("packages-2.puml"),
    PACKAGES_3("packages-3.puml"),
    NAMESPACES_1("namespaces-1.puml"),
    NAMESPACES_2("namespaces-2.puml"),
    NAMESPACES_3("namespaces-3.puml"),
    LOLLIPOP_INTERFACE("lollipop-interface.puml"),
    ARROW_DIRECTIONS_1("arrow-directions-1.puml"),
    ARROW_DIRECTIONS_2("arrow-directions-2.puml"),
    ARROW_DIRECTIONS_3("arrow-directions-3.puml"),
    ASSOCIATION_CLASSES_1("association-classes-1.puml"),
    ASSOCIATION_CLASSES_2("association-classes-2.puml"),
    SKINNING_1("skinning-1.puml"),
    SKINNING_2("skinning-2.puml"),
    SKINNING_3("skinning-3.puml"),
    SPLITTING_1("splitting-1.puml"),
    SPLITTING_2("splitting-2.puml"),
    EXTENDS_IMPLEMENTS("extends-implements.puml");

    private static final String BASE_PATH = "/classdiagrams/";

    private final String filename;

    ClassDiagram(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return BASE_PATH + filename;
    }
}
