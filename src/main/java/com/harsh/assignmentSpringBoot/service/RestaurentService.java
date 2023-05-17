package com.harsh.assignmentSpringBoot.service;

import com.harsh.assignmentSpringBoot.entity.Restaurent;

import java.util.List;
import java.util.Optional;

public interface RestaurentService {
    String bookRestro(List<Restaurent> restros);
    List<Restaurent> getRestros();
    Optional<Restaurent> getRestro(Integer restroId);

    String updateRestro(Restaurent restro);

    String deleteRestro(Integer id);
}
