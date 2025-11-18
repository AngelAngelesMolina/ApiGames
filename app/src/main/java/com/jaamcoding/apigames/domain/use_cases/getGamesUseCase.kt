package com.jaamcoding.apigames.domain.use_cases

import com.jaamcoding.apigames.domain.repository.ApiGamesRepository
import javax.inject.Inject

class getGamesUseCase @Inject constructor(private val repo: ApiGamesRepository) {
    suspend operator fun invoke() = repo.getGames()
}