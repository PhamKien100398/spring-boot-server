package com.trungkien.backend.service;

import com.trungkien.backend.dto.AnswerSheet;
import com.trungkien.backend.dto.ChoiceList;
import com.trungkien.backend.dto.ExamQuestionPoint;
import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ExamService {

    Exam saveExam(Exam exam);

    Page<Exam> findAll(Pageable pageable);

    void cancelExam(Long id);

    List<Exam> getAll();

    Optional<Exam> getExamById(Long id);

    Page<Exam> findAllByCreatedBy_Username(Pageable pageable, String username);

    List<ChoiceList> getChoiceList(List<AnswerSheet> userChoices, List<ExamQuestionPoint> examQuestionPoints);
}
