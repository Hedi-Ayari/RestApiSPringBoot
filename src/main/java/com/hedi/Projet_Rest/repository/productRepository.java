package com.hedi.Projet_Rest.repository;

import com.hedi.Projet_Rest.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Integer> {

   // product findByName(String name);

}
