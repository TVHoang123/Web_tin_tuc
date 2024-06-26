package com.web.springmvc.web_tin_tuc.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListRespone<T> {
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private long totalElement;
    private int totalPage;
    private boolean last;
}
