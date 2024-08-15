package com.ejemplo.prueva.controller;

import com.ejemplo.prueva.model.Carros;
import com.ejemplo.prueva.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@Controller
public class CarroController {
    private CarroService service;

    @Autowired
    public CarroController(CarroService service) {
        this.service = service;
    }

//    @GetMapping("/carros")
//    public List<Carros> getCarros(){
//        return service.getCarros();
//    }
    @GetMapping("/carros")
    public String getCarros(Model model){
        List<Carros> carros = service.getCarros();
        model.addAttribute("carros", carros);
        return "carros";
    }

//    @PostMapping("/api/carros")
//    public void addNewsCarros(Carros carros){
//        service.addNewsCarros(carros);
//    }

//    @DeleteMapping("delete/{id}")
//    public void deleteCarros(@PathVariable("id") Long id){
//        service.deleteCarros(id);
//    }
}
