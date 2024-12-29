package com.magicpotion.magic_potion_service.service;

import com.magicpotion.magic_potion_service.model.Potion;
import com.magicpotion.magic_potion_service.repository.PotionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotionService {

    private static final Logger logger = LoggerFactory.getLogger(PotionService.class);

    private final PotionRepository potionRepository;

    public PotionService(PotionRepository potionRepository) {
        this.potionRepository = potionRepository;
    }

    public List<Potion> getAllPotions() {
        List<Potion> potions = potionRepository.findAll();
        logger.info("Retrieved potions: {}", potions);
        return potions;
    }

    public Potion addPotion(Potion potion) {
        logger.info("Adding potion: {}", potion);
        return potionRepository.save(potion);
    }

}
