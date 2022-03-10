package com.trungkien.backend.service;

public interface ChoiceService {
    Integer findIsCorrectedById(Long id);
    String findChoiceTextById(Long id);

}
