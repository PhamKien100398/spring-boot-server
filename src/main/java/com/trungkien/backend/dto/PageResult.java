package com.trungkien.backend.dto;

import lombok.Data;
import org.springframework.data.domain.Page;

import com.trungkien.backend.dto.pagination.PaginationDetails;

import java.util.List;

@Data
public class PageResult {
    private List<Object> data;

    private PaginationDetails paginationDetails;

    public PageResult(Page page) {
        this.data = page.getContent();
        paginationDetails = new PaginationDetails(page);
    }
}
