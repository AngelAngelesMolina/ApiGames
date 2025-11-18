package com.jaamcoding.apigames.domain.repository

import com.jaamcoding.apigames.data.ApiGames
import com.jaamcoding.apigames.data.remote.model.GameList
import javax.inject.Inject

class ApiGamesRepository @Inject constructor(private val apiGames: ApiGames) {
    suspend fun getGames(): List<GameList>? {
        val response = apiGames.getGames()
        if (response.isSuccessful) {
            return response.body()?.results
        }
        return null
    }

//    suspend fun getGameById(id: Int): SingleGameModel? {
//        val response = apiGames.getGameById(id)
//        if(response.isSuccessful){
//            return response.body()
//        }
//        return null
//    }
}