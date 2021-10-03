package com.papeliyodev.movieapp.repository

import com.papeliyodev.movieapp.data.model.MovieList

interface MovieRepository {
    suspend fun getUpComingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList

}