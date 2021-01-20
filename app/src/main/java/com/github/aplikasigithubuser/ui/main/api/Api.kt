package com.github.aplikasigithubuser.ui.main.api

import com.github.aplikasigithubuser.ui.main.model.DetailUserResponse
import com.github.aplikasigithubuser.ui.main.model.User
import com.github.aplikasigithubuser.ui.main.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token dd7ea483ee296e2bb57762cb2f2aebaefdd0dfdb")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("user/{username}")
    @Headers("Authorization: token dd7ea483ee296e2bb57762cb2f2aebaefdd0dfdb")
    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token dd7ea483ee296e2bb57762cb2f2aebaefdd0dfdb")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token dd7ea483ee296e2bb57762cb2f2aebaefdd0dfdb")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>
}