package org.firas.language.syntax

/**
 *
 */
class MyType private constructor(
        val cls: MyClass?,
        val typeParam: TypeParameter?) {

    constructor(cls: MyClass): this(cls, null)

    constructor(typeParam: TypeParameter): this(null, typeParam)
}