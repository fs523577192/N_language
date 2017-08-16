package org.firas.language.syntax

import java.util.SortedSet

/**
 *
 */
class MyFunction(
        val parent: MyClass,
        val name: String,
        val static: Boolean,
        val sealed: Boolean,
        val native: Boolean,
        val firstLine: Int,
        val lastLine: Int,
        val inputs: List<ClassVariable>,
        val outputs: List<ClassVariable>
) {
}