package com.carros.api;

import com.carros.domain.Carro;
import com.carros.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {

    @Autowired
    private CarroService service;

    @GetMapping
    public ResponseEntity<Iterable<Carro>> get() {
        return ResponseEntity.ok(service.getCarros());
        //return new ResponseEntity<>(service.getCarros(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<Carro> carro = service.getCarroById(id);

        return carro
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

        // return carro.isPresent() ?
        //        ResponseEntity.ok(carro.get()) :
        //        ResponseEntity.notFound().build();

        //-------------------------------------------------

        /*if (carro.isPresent()) {
            return ResponseEntity.ok(carro.get());
        } else {
            return ResponseEntity.notFound().build();
        }*/
    }

    @GetMapping("/tipo/{tipo}")
    public Iterable<Carro> getCarrosByTipo(@PathVariable("tipo") String tipo) {
        return service.getCarroByTipo(tipo);
    }

    @PostMapping
    public void post(@RequestBody Carro carro) {
        service.save(carro);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);

        return "Carro deletado com sucesso";
    }
}
