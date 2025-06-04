/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.laura.garage.service;

import java.util.List;
import local.laura.garage.entities.Veiculo;
import local.laura.garage.repositories.garageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class GarageService {
    
    @Autowired
    private garageRepository garageRepository;
    
    public List<Veiculo> findAll(){
    
        List<Veiculo> result = garageRepository.findAll();
        return result;
    }
    
    public List<Veiculo> findById(long id){
    
        List<Veiculo> result = garageRepository.findById(id);
        return result;
    }
}

