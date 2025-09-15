package tech.crm.application.requests;

public class Pageable {
    private Integer page;
    private Integer size;

    public Pageable() {
    }

    public Pageable(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
