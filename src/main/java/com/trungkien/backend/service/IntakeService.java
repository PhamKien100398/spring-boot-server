package com.trungkien.backend.service;

import java.util.List;
import java.util.Optional;

import com.trungkien.backend.entity.Intake;

public interface IntakeService {
    public Intake findByCode(String code);
    public Optional<Intake> findById(Long id);
    public List<Intake> findAll();

}
