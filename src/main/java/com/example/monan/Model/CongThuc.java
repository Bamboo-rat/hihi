package com.example.monan.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "congthuc")
public class CongThuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CongThucID")
    private int idCT;
    @Column(name = "NguyenLieuID")
    private int idNL;
    @Column(name = "MonAnID")
    private int idMA;
    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonViTinh")
    @Size(max = 10)
    private String donViTinh;
    @ManyToOne
    @JoinColumn(name = "MonAnID",insertable = false,updatable = false)
    private MonAn monAn;
    @ManyToOne
    @JoinColumn(name = "NguyenLieuID",insertable = false,updatable = false)
    private NguyenLieu nguyenLieu;

    public int getIdCT() {
        return idCT;
    }

    public void setIdCT(int idCT) {
        this.idCT = idCT;
    }

    public int getIdNL() {
        return idNL;
    }

    public void setIdNL(int idNL) {
        this.idNL = idNL;
    }

    public int getIdMA() {
        return idMA;
    }

    public void setIdMA(int idMA) {
        this.idMA = idMA;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }

    public NguyenLieu getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(NguyenLieu nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }
}
