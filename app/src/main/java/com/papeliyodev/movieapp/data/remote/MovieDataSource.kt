package com.papeliyodev.movieapp.data.remote

import com.papeliyodev.movieapp.application.AppConstants
import com.papeliyodev.movieapp.data.model.MovieList
import com.papeliyodev.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpComingMovies(): MovieList = webService.getUpComingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.API_KEY)
}