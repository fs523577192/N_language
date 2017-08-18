package org.firas.language.syntax

/**
 *
 */
class MyClass(
        val packageName: String,
        val name: String,
        val visibility: Visibility,
        val type: ClassType,
        val definedFile: String,
        val firstLine: Int,
        val lastLine: Int,
        val parent: MyClass?, // inside which class it is defined
        val interfaces: List<ClassWithParam>, // the interfaces it implements
        val base: ClassWithParam?, // the class it extends
        val typeParams: List<TypeParameter>,
        val variables: List<ClassVariable>,
        val methods: List<MyMethod>) {

    companion object {
        val DEFAULT_PACKAGE = "system.lang"

        val obj: MyClass
        val comparable: MyClass
        val num: MyClass
        val bit: MyClass
        val uInt8: MyClass
        val int8: MyClass
        val uInt16: MyClass
        val int16: MyClass
        val uInt32: MyClass
        val int32: MyClass
        val uInt64: MyClass
        val int64: MyClass
        // val float32: MyClass
        // val float64: MyClass
        val pointer: MyClass
        val charSequence: MyClass
        val str: MyClass

        val trueBit: ClassVariable
        val falseBit: ClassVariable

        private val noTypeParam: List<TypeParameter> = ArrayList()
        private val noVariable: List<ClassVariable> = ArrayList()
        private val noClass: List<ClassWithParam> = ArrayList()
        init {

            val objectFunctions = ArrayList<MyMethod>()
            // equals, hashCode, toString
            obj = MyClass(DEFAULT_PACKAGE, "Object", Visibility.PUBLIC,
                    ClassType.NORMAL, "",0, 0, null, noClass, null,
                    noTypeParam, noVariable, objectFunctions)

            val objBase = ClassWithParam(obj, HashMap())

            val comparableTypeParam = ArrayList<TypeParameter>(1)
            val comparableFunction = ArrayList<MyMethod>()
            // compareTo
            comparable = MyClass(DEFAULT_PACKAGE, "Comparable", Visibility.PUBLIC,
                    ClassType.NORMAL, "", 0, 0, null, noClass, null,
                    comparableTypeParam, noVariable, comparableFunction)
            comparableTypeParam.add(
                    TypeParameter("T", comparable, null, MyType(obj), false))

            val numberFunctions = ArrayList<MyMethod>()
            // toBit, toUInt8, toInt8, ...
            num = MyClass(DEFAULT_PACKAGE, "Number", Visibility.PUBLIC,
                    ClassType.INTERFACE, "", 0, 0, null, noClass, null,
                    noTypeParam, noVariable, numberFunctions)

            val numberBase = ClassWithParam(num, HashMap())

            val bitInterface = ArrayList<ClassWithParam>(2)
            bitInterface.add(numberBase)
            val bitVariables = ArrayList<ClassVariable>(2)
            val bitMethods = ArrayList<MyMethod>()
            bit = MyClass(DEFAULT_PACKAGE, "Bit", Visibility.PUBLIC,
                    ClassType.NORMAL, "", 0, 0, null, bitInterface,
                    objBase, noTypeParam, bitVariables, bitMethods)
            val bitType = MyType(bit)
            falseBit = ClassVariable("FALSE", bitType, bit, Visibility.PUBLIC,
                    ClassVariableType.STATIC, 0, 0)
            trueBit = ClassVariable("TRUE", bitType, bit, Visibility.PUBLIC,
                    ClassVariableType.STATIC, 0, 0)
            bitVariables.add(falseBit)
            bitVariables.add(trueBit)

            val uInt8Interface = ArrayList<ClassWithParam>(2)
            uInt8Interface.add(numberBase)
            val uInt8Variables = ArrayList<ClassVariable>(2)
            val uInt8Methods = ArrayList<MyMethod>()
            uInt8 = MyClass(DEFAULT_PACKAGE, "UInt8", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, uInt8Interface, objBase,
                    noTypeParam, uInt8Variables, uInt8Methods)
            val uInt8Type = addMinAndMax(uInt8, uInt8Variables)

            val int8Interface = ArrayList<ClassWithParam>(2)
            int8Interface.add(numberBase)
            val int8Variables = ArrayList<ClassVariable>(2)
            val int8Methods = ArrayList<MyMethod>()
            int8 = MyClass(DEFAULT_PACKAGE, "Int8", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, int8Interface, objBase,
                    noTypeParam, int8Variables, int8Methods)
            val int8Type = addMinAndMax(int8, int8Variables)

            val uInt16Interface = ArrayList<ClassWithParam>(2)
            uInt16Interface.add(numberBase)
            val uInt16Variables = ArrayList<ClassVariable>(2)
            val uInt16Methods = ArrayList<MyMethod>()
            uInt16 = MyClass(DEFAULT_PACKAGE, "UInt16", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, uInt16Interface, objBase,
                    noTypeParam, uInt16Variables, uInt16Methods)
            val uInt16Type = addMinAndMax(uInt16, uInt16Variables)

            val int16Interface = ArrayList<ClassWithParam>(2)
            int16Interface.add(numberBase)
            val int16Variables = ArrayList<ClassVariable>(2)
            val int16Methods = ArrayList<MyMethod>()
            int16 = MyClass(DEFAULT_PACKAGE, "Int16", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, int16Interface, objBase,
                    noTypeParam, int16Variables, int16Methods)
            val int16Type = addMinAndMax(int16, int16Variables)

            val uInt32Interface = ArrayList<ClassWithParam>(2)
            uInt32Interface.add(numberBase)
            val uInt32Variables = ArrayList<ClassVariable>(2)
            val uInt32Methods = ArrayList<MyMethod>()
            uInt32 = MyClass(DEFAULT_PACKAGE, "UInt32", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, uInt32Interface, objBase,
                    noTypeParam, uInt32Variables, uInt32Methods)
            val uInt32Type = addMinAndMax(uInt32, uInt32Variables)

            val int32Interface = ArrayList<ClassWithParam>(2)
            int32Interface.add(numberBase)
            val int32Variables = ArrayList<ClassVariable>(2)
            val int32Methods = ArrayList<MyMethod>()
            int32 = MyClass(DEFAULT_PACKAGE, "Int32", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, int32Interface, objBase,
                    noTypeParam, int32Variables, int32Methods)
            val int32Type = addMinAndMax(int32, int32Variables)

            val uInt64Interface = ArrayList<ClassWithParam>(2)
            uInt64Interface.add(numberBase)
            val uInt64Variables = ArrayList<ClassVariable>(2)
            val uInt64Methods = ArrayList<MyMethod>()
            uInt64 = MyClass(DEFAULT_PACKAGE, "UInt64", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, uInt64Interface, objBase,
                    noTypeParam, uInt64Variables, uInt64Methods)
            val uInt64Type = addMinAndMax(uInt64, uInt64Variables)

            val int64Interface = ArrayList<ClassWithParam>(2)
            int64Interface.add(numberBase)
            val int64Variables = ArrayList<ClassVariable>(2)
            val int64Methods = ArrayList<MyMethod>()
            int64 = MyClass(DEFAULT_PACKAGE, "Int64", Visibility.PUBLIC, ClassType.NORMAL,
                    "", 0, 0, null, int64Interface, objBase,
                    noTypeParam, int64Variables, int64Methods)
            val int64Type = addMinAndMax(int64, int64Variables)

            val pointerTypeParam = ArrayList<TypeParameter>(1)
            val pointerVariable = ArrayList<ClassVariable>(1)
            val pointerFunction = ArrayList<MyMethod>()
            // compareTo
            pointer = MyClass(DEFAULT_PACKAGE, "Pointer", Visibility.PUBLIC,
                    ClassType.NORMAL, "", 0, 0, null, noClass, null,
                    pointerTypeParam, pointerVariable, pointerFunction)
            val pointerType = MyType(pointer)
            pointerVariable.add(ClassVariable("NULL", pointerType, pointer,
                    Visibility.PUBLIC, ClassVariableType.STATIC, 0, 0))
            pointerTypeParam.add(
                    TypeParameter("T", pointer, null, MyType(obj), false))

            val compareToInputs = ArrayList<MethodParameter>(1)
            val compareToOutput = ArrayList<MethodParameter>(1)
            comparableFunction.add(MyMethod(comparable, "compareTo",
                    Visibility.PUBLIC, MethodType.NORMAL, false, 0, 0,
                    noTypeParam, compareToInputs, compareToOutput))
            compareToInputs.add(MethodParameter("other", MyType(comparableTypeParam[0]),
                    comparableFunction[0], 0, 0))
            compareToOutput.add(MethodParameter("", int32Type,
                    comparableFunction[0], 0, 0))

            addCompareTo(uInt8Type, int32Type, uInt8Interface, uInt8Methods)
            addCompareTo(uInt16Type, int32Type, uInt16Interface, uInt16Methods)
            addCompareTo(uInt32Type, int32Type, uInt32Interface, uInt32Methods)
            addCompareTo(uInt64Type, int32Type, uInt64Interface, uInt64Methods)
            addCompareTo(int8Type, int32Type, int8Interface, int8Methods)
            addCompareTo(int16Type, int32Type, int16Interface, int16Methods)
            addCompareTo(int32Type, int32Type, int32Interface, int32Methods)
            addCompareTo(int64Type, int32Type, int64Interface, int64Methods)

            val charSequenceMethods = ArrayList<MyMethod>()
            charSequence = MyClass(DEFAULT_PACKAGE, "CharSequence",
                    Visibility.PUBLIC, ClassType.INTERFACE, "", 0, 0, null,
                    noClass, null, noTypeParam, noVariable, charSequenceMethods)
            val charSequenceBase = ClassWithParam(charSequence, HashMap())

            val strInterface = ArrayList<ClassWithParam>(2)
            strInterface.add(charSequenceBase)
            val strVariables = ArrayList<ClassVariable>()
            val strMethods = ArrayList<MyMethod>()
            str = MyClass(DEFAULT_PACKAGE, "String", Visibility.PUBLIC,
                    ClassType.NORMAL,"", 0, 0, null, strInterface, objBase,
                    noTypeParam, strVariables, strMethods)
            val strType = MyType(str)

            addCompareTo(MyType(str), int32Type, strInterface, strMethods)
            addToString(bitType, strType, bitMethods)
            addToString(uInt8Type, strType, uInt8Methods)
            addToString(uInt16Type, strType, uInt16Methods)
            addToString(uInt32Type, strType, uInt32Methods)
            addToString(uInt64Type, strType, uInt64Methods)
            addToString(int8Type, strType, int8Methods)
            addToString(int16Type, strType, int16Methods)
            addToString(int32Type, strType, int32Methods)
            addToString(int64Type, strType, int64Methods)
        }

        private fun addMinAndMax(cls: MyClass, variables: ArrayList<ClassVariable>): MyType {
            val type = MyType(cls)
            val min = ClassVariable("MIN", type, cls, Visibility.PUBLIC,
                    ClassVariableType.STATIC, 0, 0)
            val max = ClassVariable("MAX", type, cls, Visibility.PUBLIC,
                    ClassVariableType.STATIC, 0, 0)
            variables.add(min)
            variables.add(max)
            return type
        }

        private fun addCompareTo(
                type: MyType,
                int32Type: MyType,
                interfaces: ArrayList<ClassWithParam>,
                methods: ArrayList<MyMethod>) {
            val map = HashMap<TypeParameter, MyType>()
            map.put(comparable.typeParams[0], type)
            interfaces.add(ClassWithParam(comparable, map))

            val inputs = ArrayList<MethodParameter>(1)
            val outputs = ArrayList<MethodParameter>(1)
            val method = MyMethod(type.cls!!, "compareTo", Visibility.PUBLIC,
                    MethodType.NORMAL, true, 0, 0, noTypeParam,
                    inputs, outputs)
            inputs.add(MethodParameter("other", type, method, 0, 0))
            outputs.add(MethodParameter("", int32Type, method, 0, 0))
            methods.add(method)
        }

        private val noParam = ArrayList<MethodParameter>()
        private fun addToString(
                type: MyType,
                strType: MyType,
                methods: ArrayList<MyMethod>) {
            val outputs = ArrayList<MethodParameter>(1)
            val method = MyMethod(type.cls!!, "toString", Visibility.PUBLIC,
                    MethodType.NORMAL, true, 0, 0, noTypeParam,
                    noParam, outputs)
            outputs.add(MethodParameter("", strType, method, 0, 0))
            methods.add(method)
        }
    }

    init {
        if (firstLine < lastLine) {
            throw IllegalArgumentException("firstLine < lastLine")
        }

        if (type == ClassType.INTERFACE && null != base) {
            throw IllegalStateException("An interface cannot extend a class")
        }

        if (null != base) {
            if (base.cls.type == ClassType.INTERFACE) {
                throw IllegalStateException("\"implements\" should be used with an interface instead of \"extends\"")
            }
            if (base.cls.type == ClassType.SEALED) {
                throw IllegalStateException(base.cls.name + " is sealed and therefore cannot be inherited")
            }
        }
    }
}