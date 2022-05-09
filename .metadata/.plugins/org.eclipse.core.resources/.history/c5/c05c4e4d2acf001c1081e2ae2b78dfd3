package com.disneyproject.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.disneyproject.entity.Peliculas;
import com.disneyproject.service.IPeliculasService;

@Controller
public class CreateController {
	
	@Autowired
	private IPeliculasService peliculaservice;
	
	@GetMapping("/crear-pelicula")
	public String createPage(Model model) {
		//constructorVacio
		model.addAttribute("pelicula", new Peliculas());
		return "users/create";
	}
	
	@PostMapping("/guardar-pelicula")
	public String guardarPelicula(@RequestParam(name="file", required=false)MultipartFile imagen, Peliculas peliculas, RedirectAttributes mensaje) {
				
		if(!imagen.isEmpty()){
			String ruta = "C://Users//Lucho//Documents//DisneyProject//images"; 
			String nameFile = UUID.randomUUID()+" "+ imagen.getOriginalFilename();
		}
		
		try {
			byte[] bytes = imagen.getBytes();
			Path rutaFinal = Paths.get(ruta + "//" + nameFile);
			Files.write(rutaFinal, bytes);
			peliculas.setImagen(nameFile);
			
			peliculaservice.save(peliculas);
			
		}catch(Exception e) {
			e.getCause().getMessage();
		}
		
		return "redirect:users/create";
	}
}
