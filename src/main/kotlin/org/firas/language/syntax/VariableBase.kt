package org.firas.language.syntax

/**
 *
 */
abstract class VariableBase(
        val name: String,
        val type: MyClass,
        val firstLine: Int,
        val lastLine: Int
) {
}