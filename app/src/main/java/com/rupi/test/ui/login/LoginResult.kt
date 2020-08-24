package com.rupi.test.ui.login

import com.rupi.test.data.model.LoggedInUser

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
        val success: LoggedInUser? = null,
        val error: Int? = null
)