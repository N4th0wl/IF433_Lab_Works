package oop_113081_IvanderNathanaelKowira.week08

// name adalah Non-Null (Wajib), email dan phone adalah Nullable (Opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phoneNumber: String? = null // Default argument null
)