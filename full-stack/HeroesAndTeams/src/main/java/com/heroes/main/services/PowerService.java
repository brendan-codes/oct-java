package com.heroes.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.heroes.main.models.Power;
import com.heroes.main.repos.PowerRepo;

@Service
public class PowerService {
	@Autowired
	private PowerRepo powerRepo;
	
	public List<Power> allPowers(){
		return powerRepo.findAll();
	}
	
	public Power save(Power h) {
		return powerRepo.save(h);
	}
	
	public Power findById(Long id) {
		Optional<Power> power = powerRepo.findById(id);
		
		if(power.isPresent()) {
			return power.get();
		}else {
			return null;
		}
	}
	
	public void delete(Long id) {
		powerRepo.deleteById(id);
	}
}
