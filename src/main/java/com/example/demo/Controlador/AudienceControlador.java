/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import com.example.demo.Modelo.Audience;
import com.example.demo.Servicio.AudienceServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author USUARIO
 */

@RestController
@RequestMapping("/api/Audience")
@CrossOrigin(origins = "*")

public class AudienceControlador {
     @Autowired
    private AudienceServicio audienceService;
    @GetMapping("/all")
    public List<Audience> getMachines(){
        return audienceService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Audience> getMachine(@PathVariable("id") int audienceId) {
        return audienceService.getAudience(audienceId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience save(@RequestBody Audience audience) {
        return audienceService.save(audience);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience update(@RequestBody Audience audience) {
        return audienceService.update(audience);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return audienceService.deleteAudience(id);
    }
    
  
}
