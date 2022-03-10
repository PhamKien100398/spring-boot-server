package com.trungkien.backend.dto;

import com.trungkien.backend.entity.Choice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceCorrect {
    private Choice choice;
    private Integer isRealCorrect;
}
