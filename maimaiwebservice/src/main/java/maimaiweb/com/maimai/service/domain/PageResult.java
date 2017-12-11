package maimaiweb.com.maimai.service.domain;

import java.util.List;

public class PageResult {
    private long total;

    private List<?> rows;

    public PageResult(){}
    public PageResult(long total,List<?> rows){
        this.rows=rows;
        this.total=total;
    }
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
