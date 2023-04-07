package com.example.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("905507053900621/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName:String):Response<SuperheroDataResponse>

    @GET("api/905507053900621/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperHeroDetailResponse>

}