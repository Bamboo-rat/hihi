package com.example.monan.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "nguyenlieu")
public class NguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NguyenLieuID")
    private int idNL;
    @Column(name = "TenNguyenLieu")
    @Size(max = 20)
    private String tenNL;
    @Column(name = "GhiChu")
    private String ghiChu;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "nguyenLieu",cascade = CascadeType.ALL)
    List<CongThuc> congThucList;

    public int getIdNL() {
        return idNL;
    }

    public void setIdNL(int idNL) {
        this.idNL = idNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public List<CongThuc> getCongThucList() {
        return congThucList;
    }

    public void setCongThucList(List<CongThuc> congThucList) {
        this.congThucList = congThucList;
    }
}
