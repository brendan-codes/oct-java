package com.heroes.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heroes.main.models.Hero;
import com.heroes.main.models.Power;
import com.heroes.main.repos.HeroRepo;

@Service
public class HeroService {
	
	@Autowired
	private HeroRepo heroRepo;
	
	public Boolean heroHasPower(Hero hero, Power power) {
		List<Power> heroPowers = hero.getPowers();
		
		if(heroPowers.contains(power)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean heroHasThreePowers(Hero hero) {
		List<Power> heroPowers = hero.getPowers();
		
		if(heroPowers.size() >= 3) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Hero> allHeroes(){
		return heroRepo.findAll();
	}
	
	public Hero save(Hero h) {
		return heroRepo.save(h);
	}
	
	public Hero findById(Long id) {
		Optional<Hero> hero = heroRepo.findById(id);
		
		if(hero.isPresent()) {
			return hero.get();
		}else {
			return null;
		}
	}
	
	public void delete(Long id) {
		heroRepo.deleteById(id);
	}
	

}
