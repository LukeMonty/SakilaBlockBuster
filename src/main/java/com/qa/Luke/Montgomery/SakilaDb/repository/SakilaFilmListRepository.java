package com.qa.Luke.Montgomery.SakilaDb.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.Luke.Montgomery.SakilaDb.model.SakilaFilmListModel;

@Repository
public interface SakilaFilmListRepository extends JpaRepository<SakilaFilmListModel, Long> {
	SakilaFilmListModel findByTitle(String title);
	List<SakilaFilmListModel> findByCategory(String category);
}

