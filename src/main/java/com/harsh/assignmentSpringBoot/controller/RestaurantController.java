package com.harsh.assignmentSpringBoot.controller;

import com.harsh.assignmentSpringBoot.entity.Restaurent;
import com.harsh.assignmentSpringBoot.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurentService restaurantService;

    @PostMapping("/bookrestro")
    public String bookrestro(@RequestBody() List<Restaurent> restros){
        return restaurantService.bookRestro(restros);
    }

    @GetMapping("/getrestros")
    public List<Restaurent> bookrestro(){
        return restaurantService.getRestros();
    }

    @GetMapping("/getrestro")
    public Optional<Restaurent> bookrestro(@RequestParam("restroId") Integer restroId){
        return restaurantService.getRestro(restroId);
    }

    @PutMapping("/updaterestro")
    public String updateRestro(@RequestBody Restaurent restro){
        return restaurantService.updateRestro(restro);
    }

    @DeleteMapping("/deleterestro")
    public String deleteRestro(@RequestParam("id") Integer id){
        return restaurantService.deleteRestro(id);
    }
}
