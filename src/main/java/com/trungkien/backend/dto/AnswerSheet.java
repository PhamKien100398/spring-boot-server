package com.trungkien.backend.dto;

import java.util.List;

import com.trungkien.backend.entity.Choice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswerSheet {
    private Long questionId;
    private List<Choice> choices;
    private Integer point;
//    private Write write;
}
