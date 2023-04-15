package es.taw.starwars.controller;

import es.taw.starwars.dao.*;
import es.taw.starwars.entity.FraseCelebre;
import es.taw.starwars.entity.Pelicula;
import es.taw.starwars.entity.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("")
public class fraseController {
    @Autowired
    protected fraseRepository fraseRepository;

    @Autowired
    protected peliculaRepository peliculaRepository;
    @Autowired
    protected personajeRepository personajeRepository;

    @GetMapping("/")
    public String doListar (Model model){
        return this.procesar(model);
    }

    private String procesar(Model model) {
        String urlto = "frases";
        List<FraseCelebre> lista = this.fraseRepository.findAll();
        model.addAttribute("frases", lista);
        return urlto;
    }

    @GetMapping("/editar")
    public String doEditar(@RequestParam("id") Integer idPelicula, Model model){
        Pelicula pelicula = this.peliculaRepository.findById(idPelicula).orElse(null);
        return this.mostrarEditar(pelicula, model);
    }

    private String mostrarEditar(Pelicula pelicula, Model model) {
        model.addAttribute("pelicula", pelicula);
        List<Personaje> personajes = this.personajeRepository.findAll();
        model.addAttribute("personajes", personajes);
        return "frase";
    }

    @PostMapping("/guardar")
    public String doGuardar(@ModelAttribute("pelicula") Pelicula pelicula){
        this.peliculaRepository.save(pelicula);
        return "redirect:/";
    }

}
