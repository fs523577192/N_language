package org.firas.language.syntax

/**
 *
 */
class ClassVariable (
        name: String,
        dataType: MyType,
        val parent: MyClass,
        val visibility: Visibility,
        val type: ClassVariableType,
        firstLine: Int, // the lines defining the variable
        lastLine: Int // the lines defining the variable
) : VariableBase(name, dataType, firstLine, lastLine) {

    init {
        if (visibility == Visibility.PRIVATE && type == ClassVariableType.NORMAL) {
            throw IllegalStateException("A private class variable must be either static or sealed")
        }
    }
}