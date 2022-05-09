package com.disneyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.disneyproject.entity.Peliculas;

@Repository
public interface IPeliculasRepo extends JpaRepository<Peliculas, Long> {

}
