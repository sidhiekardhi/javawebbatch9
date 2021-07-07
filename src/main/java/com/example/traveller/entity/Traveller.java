package com.example.traveller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="traveller")
public class Traveller {

	@Id
	@GeneratedValue
	private int idTraveller;
	private String namatempat;
	private String lokasi;
}
