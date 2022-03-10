package com.trungkien.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.ExamUser;
import com.trungkien.backend.entity.User;

public interface ExamUserService {
    void create(Exam exam, List<User> userSet);
    List<ExamUser> getExamListByUsername(String username);
    ExamUser findByExamAndUser(Long examId, String username);
    void update(ExamUser examUser);
    Optional<ExamUser> findExamUserById(Long id);

    List<ExamUser> getCompleteExams(Long courseId, String username);
    List<ExamUser> findAllByExam_Id(Long examId);
    List<ExamUser> findExamUsersByIsFinishedIsTrueAndExam_Id(Long examId);


}
