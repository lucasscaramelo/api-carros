package com.carros.domain;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {

    public List<Carro> getCarros() {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro(1L, "Civic"));
        carros.add(new Carro(2L, "Gol"));
        carros.add(new Carro(3L, "HRV"));

        return carros;
    }
}
