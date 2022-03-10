package com.trungkien.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.trungkien.backend.entity.Question;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceList{
    private Question question;
    private List<ChoiceCorrect> choices;
    private Integer point;
    private Boolean isSelectedCorrected;
}
