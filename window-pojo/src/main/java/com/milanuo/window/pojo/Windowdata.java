package com.milanuo.window.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Windowdata {
    private Long id;

    private Integer inputheight;

    private Integer inputwidth;

    private Integer inputnumber;

    private String materialstype;

    private String type;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date memorydate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInputheight() {
        return inputheight;
    }

    public void setInputheight(Integer inputheight) {
        this.inputheight = inputheight;
    }

    public Integer getInputwidth() {
        return inputwidth;
    }

    public void setInputwidth(Integer inputwidth) {
        this.inputwidth = inputwidth;
    }

    public Integer getInputnumber() {
        return inputnumber;
    }

    public void setInputnumber(Integer inputnumber) {
        this.inputnumber = inputnumber;
    }

    public String getMaterialstype() {
        return materialstype;
    }

    public void setMaterialstype(String materialstype) {
        this.materialstype = materialstype == null ? null : materialstype.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getMemorydate() {
        return memorydate;
    }

    public void setMemorydate(Date memorydate) {
        this.memorydate = memorydate;
    }
}