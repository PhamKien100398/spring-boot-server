package com.trungkien.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.ExamUser;
import com.trungkien.backend.entity.User;

import java.util.List;

@Repository
public interface ExamUserRepository extends JpaRepository<ExamUser, Long> {
    List<ExamUser> findAllByUser_Username(String username);
    List<ExamUser> findAllByUser_UsernameAndExam_Canceled(String username, boolean canceled);
    ExamUser findByExam_IdAndUser_Username(Long examId, String username);
    List<ExamUser> findAllByExam_Part_Course_IdAndUser_UsernameAndTotalPointIsGreaterThan(Long courseId, String username, Double point);
    List<ExamUser> findAllByExam_Id(Long examId);
    List<ExamUser> findExamUsersByOrderByTimeFinish();
    List<ExamUser> findExamUsersByIsFinishedIsTrueAndExam_Id(Long examId);
}
