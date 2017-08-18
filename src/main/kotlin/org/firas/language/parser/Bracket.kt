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

            MAP = m
            REVERSE_MAP = rm
        }
    }

    private var stack = CharArray(10)
    private var top = -1

    fun add(bracket: Char): Boolean {
        if (!MAP.containsKey(bracket)) {
            return false
        }
        top += 1
        ensureCapacity()
        stack[top] = bracket
        return true
    }

    fun match(bracket: Char): Boolean {
        if (top < 0) return false
        if (stack[top].equals(REVERSE_MAP.get(bracket))) {
            top -= 1
            return true
        }
        return false
    }

    private fun ensureCapacity() {
        if (top >= stack.size - 1) {
            stack = stack.copyOf(stack.size + 10)
        }
    }
}