package com.papeliyodev.movieapp.data.local

import com.papeliyodev.movieapp.application.AppConstants
import com.papeliyodev.movieapp.data.model.MovieEntity
import com.papeliyodev.movieapp.data.model.MovieList
import com.papeliyodev.movieapp.data.model.toMovieList

class LocalMovieDataSource(private val movieDao: MovieDao) {

    suspend fun getUpComingMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movie_type == "upcoming" }.toMovieList()
    }

    suspend fun getTopRatedMovies(): MovieList {
        return movieDao.getAllMovies().filter { it.movie_type == "toprated" }.toMovieList()

    }

    suspend fun getPopularMovies(): MovieList  {
        return movieDao.getAllMovies().filter { it.movie_type == "popular" }.toMovieList()

    }

    suspend fun saveMovie(movie: MovieEntity){
        movieDao.saveMovie(movie)
    }


}