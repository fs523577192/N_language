package org.firas.language.syntax

import org.firas.language.Visibility

/**
 *
 */
class MyClass(
        val name: String,
        val visibility: Visibility,
        val sealed: Boolean,
        val definedFile: String,
        val firstLine: Int,
        val lastLine: Int,
        private val variables: MutableList<ClassVariable>,
        private val methods: MutableList<MyFunction>) {

    val Bit = MyClass("Bit", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val UInt8 = MyClass("UInt8", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val Int8 = MyClass("Int8", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val UInt16 = MyClass("UInt16", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val Int16 = MyClass("Int16", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val UInt32 = MyClass("UInt32", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val Int32 = MyClass("Int32", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val UInt64 = MyClass("UInt64", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
    val Int64 = MyClass("Int64", Visibility.PUBLIC, false,
            "", 0, 0, ArrayList<ClassVariable>(), ArrayList<MyFunction>())
}