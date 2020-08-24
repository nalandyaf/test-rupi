package com.rupi.test.data

import com.rupi.test.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, email: String, password: String): Result<LoggedInUser> {
        try {
            val fakeUser = LoggedInUser(username, email, password)
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {

    }
}