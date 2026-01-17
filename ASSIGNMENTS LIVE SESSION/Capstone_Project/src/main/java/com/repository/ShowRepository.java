package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer>{
	
	
	List <Show> findByMovieMovieid(int movieid);

}
