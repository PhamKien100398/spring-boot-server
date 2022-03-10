package com.trungkien.backend.dto;

import com.trungkien.backend.entity.Question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionExamReport {
    private Question question;
    private int correctTotal;

}
