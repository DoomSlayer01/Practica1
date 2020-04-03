package ui.ejercicio2

class Str {

    fun revert(st: String):String{
        return st.reversed()
    }

    fun isPalindrome(st: String): Boolean {
        return st == (revert(st))
    }

    fun vowels(st: String): Int {
        var vocales = 0
        for (i in st){
            when (i){
                'a','e','i','o','u'-> vocales++
            }
        }
        return vocales
    }

    fun words(st: String): Int {
        return st.split(' ').size
    }

    fun countParagraphs(st: String): Int {
        return st.split("\n").size
    }

}

