package com.trungkien.backend.dto;

import lombok.Data;

import java.util.List;

import com.trungkien.backend.entity.Exam;

@Data
public class ExamDto {
    private Exam exam;
    private List<ExamQuestionPoint> examQuestionPoints;
}
