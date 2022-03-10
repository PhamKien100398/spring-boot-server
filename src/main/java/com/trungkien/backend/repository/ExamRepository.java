package com.trungkien.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.User;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

    List<Exam> findAllByPart_Course_Id(Long courseId);
List<Exam> findByCanceledIsTrueOrderByCreatedDateDesc();
    public Page<Exam> findAll(Pageable pageable);
    public Page<Exam> findAllByCreatedBy_Username(Pageable pageable, String username);
    @Transactional
    @Modifying
    @Query(value = "UPDATE exam set exam.canceled=true where exam.id=?" , nativeQuery = true)
    void cancelExam(Long id);

}
