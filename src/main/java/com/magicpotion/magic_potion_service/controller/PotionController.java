package com.magicpotion.magic_potion_service.controller;

import com.magicpotion.magic_potion_service.model.Potion;
import com.magicpotion.magic_potion_service.service.PotionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potions")
public class PotionController {

    private static final Logger logger = LoggerFactory.getLogger(PotionController.class);

    private final PotionService potionService;

    public PotionController(PotionService potionService) {
        this.potionService = potionService;
    }

    @GetMapping
    public List<Potion> getPotions() {
        List<Potion> potions = potionService.getAllPotions();
        logger.info("Retrieved potions: {}", potions);
        return potions;
    }

    @PostMapping
    public Potion addPotion(@RequestBody Potion potion) {
        logger.info("Adding potion: {}", potion);
        return potionService.addPotion(potion);
    }

}
