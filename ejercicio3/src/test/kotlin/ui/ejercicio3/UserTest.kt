package ui.ejercicio3

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class UserTest{

    val user3 = User("Nikolas Padron",
            "Messi10",
            "Messi10@gmail.com",
            "18/03/1997",
            arrayListOf(),
            arrayListOf())

    val user2 = User("Gaby Padron",
            "Messi10",
            "Messi10@outlook.com",
            "18/03/1997",
            arrayListOf(),
            arrayListOf())
    @Test
    fun user2FollowsUser3(){

        user2.follow(user3)

        assertTrue((user3.followers).contains(user2))
    }
}