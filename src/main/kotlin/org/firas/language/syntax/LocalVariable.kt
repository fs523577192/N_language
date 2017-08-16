package org.firas.language.syntax

/**
 *
 */
class LocalVariable (
        name: String,
        type: MyClass,
        val parent: MyFunction,
        firstLine: Int, // the line the variable is defined (first appears)
        lastLine: Int // the line the variable last appears
) : VariableBase(name, type, firstLine, lastLine) {
}