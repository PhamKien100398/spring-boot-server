package com.trungkien.backend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.trungkien.backend.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Optional<Course> getCourseById(Long id);

    List<Course> getCourseList();

    Page<Course> getCourseListByPage(Pageable pageable);

    void saveCourse(Course course);

    void delete(Long id);

    boolean existsByCode(String code);

    boolean existsById(Long id);

    List<Course> findAllByIntakeId(Long intakeId);
    Course findCourseByPartId(Long partId);

}
