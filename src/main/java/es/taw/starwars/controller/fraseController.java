package es.taw.starwars.controller;

import es.taw.starwars.dao.fraseRepository;
import es.taw.starwars.entity.FraseCelebre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/frases")
public class fraseController {
    @Autowired
    protected fraseRepository fraseRepository;

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

}
