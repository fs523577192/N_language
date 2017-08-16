package org.firas.language.syntax

/**
 *
 */
class ClassVariable (
        name: String,
        type: MyClass,
        val parent: MyClass,
        firstLine: Int, // the lines defining the variable
        lastLine: Int // the lines defining the variable
) : VariableBase(name, type, firstLine, lastLine) {
}