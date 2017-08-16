package org.firas.language.parser

class Bracket {

    companion object {

        val MAP: Map<Char, Char>
        val REVERSE_MAP: Map<Char, Char>

        init {
            val m = HashMap<Char, Char>(7, 1f)
            val rm = HashMap<Char, Char>(7, 1f)

            m.put('\'', '\'')
            rm.put('\'', '\'')

            m.put('"', '"')
            rm.put('"', '"')

            m.put('(', ')')
            rm.put(')', '(')

            m.put('[', ']')
            rm.put(']', '[')

            m.put('{', '}')
            rm.put('}', '{')

            m.put('(', ')')
            rm.put(')', '(')

            m.put('<', '>')
            rm.put('>', '<')
        }
    }

    private var stack = CharArray(0, 0.toChar())
    private var top = 0

    fun add(bracket: Char) {
    }

    fun match(bracket: Char): Boolean {
        return false
    }
}
