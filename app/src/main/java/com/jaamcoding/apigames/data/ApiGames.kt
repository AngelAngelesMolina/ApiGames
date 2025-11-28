package com.jaamcoding.apigames.data

import com.jaamcoding.apigames.data.remote.model.GamesModel
import com.jaamcoding.apigames.data.remote.model.SingleGameModel
import com.jaamcoding.apigames.utils.Constants.Companion.API_KEY
import com.jaamcoding.apigames.utils.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGames {

    @GET(GAMES_ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>

    @GET("$GAMES_ENDPOINT/{id}$API_KEY")
    suspend fun getGameById(@Path(value = "id") id: Int): Response<SingleGameModel>

}