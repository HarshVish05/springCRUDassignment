package com.harsh.assignmentSpringBoot.service;

import com.harsh.assignmentSpringBoot.dao.RestaurentDao;
import com.harsh.assignmentSpringBoot.entity.Restaurent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RestaurentServImp implements RestaurentService{
    @Autowired
    private RestaurentDao restroDao;


    @Override
    public String bookRestro(List<Restaurent> restros) {
        restroDao.saveAll(restros);
        return "Restaurant is saved successfully"+restros.size();
    }

    @Override
    public List<Restaurent> getRestros() {
        return (List<Restaurent>)restroDao.findAll();
    }

    @Override
    public Optional<Restaurent> getRestro(Integer restroId) {
        return (Optional<Restaurent>) restroDao.findById(restroId);
    }

    @Override
    public String updateRestro(Restaurent restro){
        restroDao.save(restro);
        return "record updated successfully";
    }

    @Override
    public String deleteRestro(Integer id){
        restroDao.deleteById(id);
        return "record deleted successfully";
    }

}
