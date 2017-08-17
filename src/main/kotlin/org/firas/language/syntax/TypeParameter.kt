package org.firas.language.syntax

/**
 *
 */
class TypeParameter(
        val name: String,
        val parentClass: MyClass,
        val parentMethod: MyMethod?,
        val bound: MyType,
        val upperOrLower: Boolean // false: upper bound, true: lower bound
) {
}