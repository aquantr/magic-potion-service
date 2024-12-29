package com.magicpotion.magic_potion_service.repository;

import com.magicpotion.magic_potion_service.model.Potion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionRepository extends JpaRepository<Potion, Long> {
}
