package com.jaamcoding.apigames.data

import com.jaamcoding.apigames.data.remote.model.GamesModel
import com.jaamcoding.apigames.utils.Constants.Companion.API_KEY
import com.jaamcoding.apigames.utils.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface ApiGames {

    @GET(GAMES_ENDPOINT + API_KEY)
    suspend fun getGames(): Response<List<GamesModel>>

}