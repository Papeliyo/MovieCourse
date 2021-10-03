package com.papeliyodev.movieapp.repository

import com.papeliyodev.movieapp.data.model.MovieList
import com.papeliyodev.movieapp.data.remote.RemoteMovieDataSource

class MovieRepositoryImpl(private val dataSourceRemote: RemoteMovieDataSource) : MovieRepository{

    override suspend fun getUpComingMovies(): MovieList = dataSourceRemote.getUpComingMovies()

    override suspend fun getTopRatedMovies(): MovieList = dataSourceRemote.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList = dataSourceRemote.getPopularMovies()
}