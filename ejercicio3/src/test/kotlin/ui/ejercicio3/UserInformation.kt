package ui.ejercicio3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserInformationTest {

    val user3 = User("Nikolas Padron",
                     "Messi10",
                     "Messi10@gmail.com",
                     "18/03/1997",
                      arrayListOf(),
                      arrayListOf())

    val user2 = User("Nikolas Padron",
                     "Messi10",
                     "Messi10@outlook.com",
                     "18/03/1997",
                     arrayListOf(),
                     arrayListOf())

    val user  = User("Nikolas Padron",
                     "Messi10",
                     "Messi10@gmail.com",
                     "18/03/1997",
                     arrayListOf(user2, user3),
                     arrayListOf(user2))



    val userInfo: UserInformation = UserInformation()

    @Test

    fun informationCollectedIsTheSameAsTheUser() {

        assertTrue(userInfo.obtainUserInformation(user).containsAll(listOf(user.birthDate,
                                                                            user.email,
                                                                            user.nickname,
                                                                            user.nameAndLastName,
                                                                            user.following,
                                                                            user.followers)))
    }

    @Test

    fun calculateUserAge() {

        assertEquals(userInfo.calculateUserAge(user), 23)
    }

    @Test

    fun verifyUserEmailIsRegisteredOnGmail() {

        assertTrue(userInfo.verifyRegisteredGmailAccount(user))
        assertFalse(userInfo.verifyRegisteredGmailAccount(user2))
    }

    @Test

    fun obtainFollowersUserIsFollowingTest(){
        user.follow(user2)
        user2.follow (user)
        user3.follow(user)

        assertTrue(userInfo.obtainFollowersUserIsFollowing(user).contains( user2))
        assertFalse(userInfo.obtainFollowersUserIsFollowing(user).contains(user3))
    }
}







