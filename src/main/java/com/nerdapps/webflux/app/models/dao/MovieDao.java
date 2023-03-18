package com.nerdapps.webflux.app.models.dao;

import com.nerdapps.webflux.app.models.documents.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDao extends ReactiveMongoRepository<Movie,String> {
}
