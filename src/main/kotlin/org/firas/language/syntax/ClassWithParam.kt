package org.firas.language.syntax

/**
 *
 */
class ClassWithParam(
        val cls: MyClass,
        val parameters: Map<TypeParameter, MyType>
) {
    init {
        parameters.keys
                .filterNot { it in cls.typeParams }
                .forEach {
                    throw IllegalArgumentException(
                            it.name + " is not a type-parameter of " + cls.name)
                }
    }
}