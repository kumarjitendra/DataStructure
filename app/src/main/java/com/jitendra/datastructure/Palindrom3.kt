package com.jitendra.datastructure

import java.io.BufferedReader
import java.io.File
import java.util.*

object Main {
    /* The name of the class has to be Main. */
    @JvmStatic
    fun main(args: Array<String>) {
        val `in`: BufferedReader
        val n = 0
        val j = 0
        val i = 0
        val result: Boolean? = null
        val fileName = "inputfile.txt"
        val file = File(fileName)
         file.createNewFile()
        val str = Scanner(System.`in`)
        print("Enter text  : ")

        // nextInt() reads the next integer from the keyboard
        val txt:String = str.next()

        println("You entered: $txt")

     /*   file.bufferedWriter().use { out ->
            out.write(str.toString())
        }
        */
        /*    val inputString = file.bufferedReader().use { it.readLine() }
            println("input string in file $inputString")*/
/*
            try {
                `in` = BufferedReader(FileReader(File(args[0])))
                val line = `in`.readLine()
                println(line)
                 if (result != null) {
                    println(if (result) 1 else 0)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }*/

        // Calculating string length


        // Calculating string length
        val len: Int = txt.length

        // Traversing through the string
        // upto hlaf its length
        // Traversing through the string
        // upto hlaf its length
        for (i in 0 until len / 2) {
            // Comparing i th character
            // from starting and len-i
            // th character from end
            if (txt.get(i) != txt.get(len - i - 1))
                println(0)
            else print(1)

        }


        }
    }
