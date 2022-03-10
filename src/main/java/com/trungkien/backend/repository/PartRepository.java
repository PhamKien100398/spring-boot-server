package com.trungkien.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trungkien.backend.entity.Course;
import com.trungkien.backend.entity.Part;

import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    Page<Part> findAllByCourseId(Long courseId, Pageable pageable);

    List<Part> findAllByCourse(Course course);

}
