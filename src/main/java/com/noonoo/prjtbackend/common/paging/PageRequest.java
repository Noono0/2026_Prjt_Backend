package com.noonoo.prjtbackend.common.paging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequest {
    /** 현재 페이지 */
    private int page = 1;

    /** 페이지 크기 */
    private int size = 20;

    /** 정렬 컬럼 */
    private String sortBy = "memberSeq";

    /** 정렬 방향 */
    private String sortDir = "desc";

    public int getSafePage() {
        return page <= 0 ? 1 : page;
    }

    public int getSafeSize() {
        if (size <= 0) return 20;
        return Math.min(size, 100);
    }

    public int getOffset() {
        return (getSafePage() - 1) * getSafeSize();
    }
}