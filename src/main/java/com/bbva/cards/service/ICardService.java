package com.bbva.cards.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbva.cards.dto.Cards;

public interface ICardService extends JpaRepository<Cards, Integer> {

}
