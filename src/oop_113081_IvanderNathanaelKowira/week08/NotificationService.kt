package oop_113081_IvanderNathanaelKowira.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR: Type mismatch
        if(user.email != null) {
            // SUCCESS vai Smart Cast: compiler tahu 'user.email' pasti tidak nul di block ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }

}