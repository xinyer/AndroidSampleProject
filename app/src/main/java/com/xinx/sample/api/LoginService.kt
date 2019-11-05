package com.xinx.sample.api

import com.xinx.sample.model.User
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface LoginService {

    @POST("/login")
    fun login(@Body name: String, @Body password: String): Observable<Response<Boolean>>

    @GET("/user")
    fun getUser(): Observable<Response<User>>
}