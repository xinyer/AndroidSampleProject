package com.xinx.sample.api

data class Response<T> (
    val code: Int,
    val msg: String,
    val data: T)