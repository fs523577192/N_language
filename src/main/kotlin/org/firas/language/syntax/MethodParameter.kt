package org.firas.language.syntax

/**
 *
 */
class MethodParameter(
        name: String,
        dataType: MyType,
        val parent: MyMethod,
        firstLine: Int,
        lastLine: Int
): VariableBase(name, dataType, firstLine, lastLine) {
}