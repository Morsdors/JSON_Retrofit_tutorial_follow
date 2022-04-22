package com.example.jsontutorialfollow

import retrofit2.Call
import retrofit2.http.GET
//import java.util.ArrayList


internal interface MyApi {
    @GET("posts")

    fun getData(): Call<List<MyDataItem>>

    //fun callModel(): Call<ArrayList<Model?>?>?
}