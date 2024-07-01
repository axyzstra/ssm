package com.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageResult<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer total;
    private List<T> data;
}
