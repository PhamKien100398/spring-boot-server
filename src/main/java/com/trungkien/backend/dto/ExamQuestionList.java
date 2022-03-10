package com.trungkien.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.Question;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamQuestionList {
    private Exam exam;
    private List<Question> questions;
    private int remainingTime;
}
