package org.firas.language.syntax

/**
 *
 */
abstract class VariableBase(
        val name: String,
        val dataType: MyType,
        val firstLine: Int,
        val lastLine: Int
) {
    init {
        if (firstLine < lastLine) {
            throw IllegalArgumentException("firstLine < lastLine")
        }
    }
}