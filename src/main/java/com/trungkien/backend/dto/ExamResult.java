package com.trungkien.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import com.trungkien.backend.entity.Choice;
import com.trungkien.backend.entity.Exam;
import com.trungkien.backend.entity.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamResult {
    private Exam exam;
    private List<ChoiceList> choiceList;
    private Double totalPoint;
    private User user;
    private Date userTimeBegin;
    private Date userTimeFinish;
    private int examStatus;
    private int remainingTime;


    public ExamResult(Exam exam, List<ChoiceList> choiceList, Double totalPoint) {
        this.exam = exam;
        this.choiceList = choiceList;
        this.totalPoint = totalPoint;
    }


}
