package com.trungkien.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.trungkien.backend.entity.Course;
import com.trungkien.backend.entity.Part;

import java.util.List;
import java.util.Optional;

public interface PartService {
    void savePart(Part part);

    Page<Part> getPartLisByCourse(Pageable pageable, Long courseId);

    List<Part> getPartListByCourse(Course course);

    Optional<Part> findPartById(Long id);

    boolean existsById(Long id);
}
