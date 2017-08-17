package org.firas.language.syntax

/**
 *
 */
class LocalVariable (
        name: String,
        dataType: MyType,
        val parent: MyMethod,
        firstLine: Int, // the line the variable is defined (first appears)
        lastLine: Int // the line the variable last appears
) : VariableBase(name, dataType, firstLine, lastLine) {
}