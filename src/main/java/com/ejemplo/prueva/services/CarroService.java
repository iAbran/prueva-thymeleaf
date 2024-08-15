package com.ejemplo.prueva.services;

import com.ejemplo.prueva.model.Carros;
import com.ejemplo.prueva.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {
    private CarroRepository repository;

    @Autowired
    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }

    public List<Carros> getCarros() {
        return repository.findAll();
    }

//    public void addNewsCarros(Carros carros) {
//        repository.save(carros);
//    }
//
//    public void deleteCarros(Long id) {
//        Optional<Carros> carrosId = repository.findById(id);
//
//    }
}
