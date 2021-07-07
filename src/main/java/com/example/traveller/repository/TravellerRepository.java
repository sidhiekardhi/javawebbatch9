package com.example.traveller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.traveller.entity.Traveller;

@Repository
public interface TravellerRepository extends JpaRepository<Traveller, Integer>{

}
