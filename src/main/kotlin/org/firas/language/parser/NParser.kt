package org.firas.language.parser

import java.io.File
import java.util.Scanner
import org.firas.language.Parser

/**
 *
 */
class NParser(val file: File) : Parser {

    companion object {
        val TAB = "    "

        val DEFINE = "Define"
        val ASA = arrayOf("as a", "as an")

        val STATIC = "static"

        val SEALED = "sealed"
    }

    val scanner
    init {
        scanner = Scanner()
    }

    fun parse() {
        var lineNumber = 0
        var currentIndent = 0
        while (true) {
            val line = scanner.nextLine()
            if (null == line) break;
            lineNumber += 1
            
        }
    }
}
