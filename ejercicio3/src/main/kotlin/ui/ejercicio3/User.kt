package ui.ejercicio3


class User( val nameAndLastName: String,val nickname: String,val email: String, val birthDate: String,val followers:ArrayList<User>,val following:ArrayList<User>) {

    fun follow(user: User): Unit {

        this.following.add(user)
        user.followers.add(this)
    }
}
