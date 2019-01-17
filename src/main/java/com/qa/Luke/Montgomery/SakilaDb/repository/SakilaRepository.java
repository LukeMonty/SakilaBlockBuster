package com.qa.Luke.Montgomery.SakilaDb.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.Luke.Montgomery.SakilaDb.model.SakilaModel;

@Repository
public interface SakilaRepository extends JpaRepository<SakilaModel, Long> {
	SakilaModel findByTitle(String title);
}
