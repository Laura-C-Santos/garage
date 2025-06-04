package local.laura.garage.repositories;

import local.laura.garage.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ppjatb
 */


public interface garageRepository extends JpaRepository<Veiculo, Long>{
    
}
