package ui.ejercicio3

import java.io.Serializable
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class UserInformation {

    fun obtainUserInformation (user: User): ArrayList<Serializable> {
        var usrInf = arrayListOf(user.nameAndLastName,user.email,user.birthDate,user.nickname,user.followers,user.following)
        return usrInf
        }

    fun calculateUserAge(user: User): Int {
        val frmt : DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val today: LocalDate = LocalDate.now()
        val usrBirthDate :LocalDate = LocalDate.parse(user.birthDate,frmt)
        val edad: Int =Period.between(usrBirthDate,today).years
        return edad
    }

    fun verifyRegisteredGmailAccount(user: User): Boolean {

        return ((user.email).split('@').last() =="gmail.com")
    }

    fun obtainFollowersUserIsFollowing(user: User):ArrayList<User> {

        var followersThatUserFollow: ArrayList<User> = ArrayList()

        for (usr in user.followers) {
            if (usr.followers.contains(user)) {
                followersThatUserFollow.add(usr)
            }
        }
        return followersThatUserFollow
    }

}



