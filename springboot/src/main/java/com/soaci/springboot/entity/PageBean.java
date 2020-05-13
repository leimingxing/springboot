package com.soaci.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class PageBean<T> extends PageInfo<T> {

    public PageBean(List<T> list) {
        super(list);
    }

    @JsonIgnore
    @Override
    public int getPageNum() {
        return super.getPageNum();
    }
    @JsonIgnore
    @Override
    public void setPageNum(int pageNum) {
        super.setPageNum(pageNum);
    }
    @JsonIgnore
    @Override
    public int getPageSize() {
        return super.getPageSize();
    }
    @JsonIgnore
    @Override
    public void setPageSize(int pageSize) {
        super.setPageSize(pageSize);
    }
    @JsonIgnore
    @Override
    public int getSize() {
        return super.getSize();
    }
    @JsonIgnore
    @Override
    public void setSize(int size) {
        super.setSize(size);
    }
    @JsonIgnore
    @Override
    public int getStartRow() {
        return super.getStartRow();
    }
    @JsonIgnore
    @Override
    public void setStartRow(int startRow) {
        super.setStartRow(startRow);
    }
    @JsonIgnore
    @Override
    public int getEndRow() {
        return super.getEndRow();
    }
    @JsonIgnore
    @Override
    public void setEndRow(int endRow) {
        super.setEndRow(endRow);
    }
    @JsonIgnore
    @Override
    public int getPages() {
        return super.getPages();
    }
    @JsonIgnore
    @Override
    public void setPages(int pages) {
        super.setPages(pages);
    }
    @JsonIgnore
    @Override
    public int getPrePage() {
        return super.getPrePage();
    }
    @JsonIgnore
    @Override
    public void setPrePage(int prePage) {
        super.setPrePage(prePage);
    }
    @JsonIgnore
    @Override
    public int getNextPage() {
        return super.getNextPage();
    }
    @JsonIgnore
    @Override
    public void setNextPage(int nextPage) {
        super.setNextPage(nextPage);
    }
    @JsonIgnore
    @Override
    public boolean isIsFirstPage() {
        return super.isIsFirstPage();
    }
    @JsonIgnore
    @Override
    public void setIsFirstPage(boolean isFirstPage) {
        super.setIsFirstPage(isFirstPage);
    }
    @JsonIgnore
    @Override
    public boolean isIsLastPage() {
        return super.isIsLastPage();
    }
    @JsonIgnore
    @Override
    public void setIsLastPage(boolean isLastPage) {
        super.setIsLastPage(isLastPage);
    }
    @JsonIgnore
    @Override
    public boolean isHasPreviousPage() {
        return super.isHasPreviousPage();
    }
    @JsonIgnore
    @Override
    public void setHasPreviousPage(boolean hasPreviousPage) {
        super.setHasPreviousPage(hasPreviousPage);
    }
    @JsonIgnore
    @Override
    public boolean isHasNextPage() {
        return super.isHasNextPage();
    }
    @JsonIgnore
    @Override
    public void setHasNextPage(boolean hasNextPage) {
        super.setHasNextPage(hasNextPage);
    }
    @JsonIgnore
    @Override
    public int getNavigatePages() {
        return super.getNavigatePages();
    }
    @JsonIgnore
    @Override
    public void setNavigatePages(int navigatePages) {
        super.setNavigatePages(navigatePages);
    }
    @JsonIgnore
    @Override
    public int[] getNavigatepageNums() {
        return super.getNavigatepageNums();
    }
    @JsonIgnore
    @Override
    public void setNavigatepageNums(int[] navigatepageNums) {
        super.setNavigatepageNums(navigatepageNums);
    }
    @JsonIgnore
    @Override
    public int getNavigateFirstPage() {
        return super.getNavigateFirstPage();
    }
    @JsonIgnore
    @Override
    public int getNavigateLastPage() {
        return super.getNavigateLastPage();
    }
    @JsonIgnore
    @Override
    public void setNavigateFirstPage(int navigateFirstPage) {
        super.setNavigateFirstPage(navigateFirstPage);
    }
    @JsonIgnore
    @Override
    public void setNavigateLastPage(int navigateLastPage) {
        super.setNavigateLastPage(navigateLastPage);
    }

    @JsonProperty("items")
    @Override
    public List<T> getList() {
        return super.getList();
    }
    @JsonProperty("items")
    @Override
    public void setList(List<T> list) {
        super.setList(list);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
