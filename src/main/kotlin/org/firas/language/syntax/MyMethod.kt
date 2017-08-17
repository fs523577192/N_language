package org.firas.language.syntax

/**
 *
 */
class MyMethod(
        val parent: MyClass,
        val name: String,
        val visibility: Visibility,
        val type: MethodType,
        val native: Boolean,
        val firstLine: Int,
        val lastLine: Int,
        val typeParams: List<TypeParameter>,
        val inputs: List<MethodParameter>,
        val outputs: List<MethodParameter>
) {
    init {
        if (firstLine < lastLine) {
            throw IllegalArgumentException("firstLine < lastLine")
        }
    }
}