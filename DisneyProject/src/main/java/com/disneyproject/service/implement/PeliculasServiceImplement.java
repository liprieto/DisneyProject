package com.disneyproject.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disneyproject.entity.Peliculas;
import com.disneyproject.repository.IPeliculasRepo;
import com.disneyproject.service.IPeliculasService;

@Service
public class PeliculasServiceImplement implements IPeliculasService {
	
	@Autowired
	private IPeliculasRepo peliculasRepo;
	
	@Override
	public void save(Peliculas peliculas) {
		peliculasRepo.save(peliculas);
		
		
	}

}
