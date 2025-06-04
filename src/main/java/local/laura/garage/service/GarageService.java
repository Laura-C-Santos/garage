/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.laura.garage.service;

import java.util.List;
import local.laura.garage.DTO.GarageMinDTO;

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
    
    public List<GarageMinDTO> findAll(){
    
        List<Veiculo> resultGarage = garageRepository.findAll();
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        return resultDTO;
    }
    
    public List<Veiculo> findById(long id){
    
        List<Veiculo> result = garageRepository.findById(id);
        return result;
    }
    public List<GarageMinDTO> findByCorIgnoreCase(String cor){
    
        List<Veiculo> resultGarage = garageRepository.findByCorIgnoreCase(cor);
        
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        
        return resultDTO;
    }
    public List<GarageMinDTO> findByAno(int ano){
    
        List<Veiculo> resultGarage = garageRepository.findByAno(ano);
        
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        
        return resultDTO;
    }
}

