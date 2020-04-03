package ui.ejercicio2
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class StrTest {

    val str=Str()

    @Test
    fun revertString() = assertEquals(str.revert("hola"),"aloh")
    @Test
    fun isPalindromeTest() = assertTrue(str.isPalindrome("neuquen"))
    @Test
    fun vowelsTest() = assertEquals (str.vowels("murcielago"),5)
    @Test
    fun wordsTest() = assertEquals(str.words("hola que ase"),3 )
    @Test
    fun countParagraphTest()= assertEquals(str.countParagraphs("hola q ase \n bn vos masterYi"),2)
}
