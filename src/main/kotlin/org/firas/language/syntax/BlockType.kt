package org.firas.language.syntax

enum class BlockType(val value: String) {

    CLASS("class"),
    METHOD("method"),
    IF("if"),
    ELSE_IF("else if"),
    ELSE("else"),
    FOR("for"),
    WHILE("while")
}
