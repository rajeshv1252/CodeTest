package com.codetest.data.network

class ApiException(val code: String? = null, message: String? = null, localMessage: String? = null) : RuntimeException(message)
