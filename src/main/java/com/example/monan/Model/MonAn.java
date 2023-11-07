package com.example.monan.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "monan")
public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MonAnID")
    private int idMA;
    @Column(name = "LoaiMonAnID")
    private int idLMA;
    @Column(name = "TenMon")
    @Size(max = 20)
    private String tenMon;
    @Column(name = "GiaBan")
    private double giaBan;
    @Column(name = "GioiThieu")
    private String gioiThieu;
    @Column(name = "CachLam")
    private String cachLam;
    @ManyToOne
    @JoinColumn(name = "LoaiMonAnID",insertable = false,updatable = false)
    private LoaiMonAn loaiMonAn;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "monAn",cascade = CascadeType.ALL)
    private List<CongThuc> congThucList;

    public int getIdMA() {
        return idMA;
    }

    public void setIdMA(int idMA) {
        this.idMA = idMA;
    }

    public int getIdLMA() {
        return idLMA;
    }

    public void setIdLMA(int idLMA) {
        this.idLMA = idLMA;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getCachLam() {
        return cachLam;
    }

    public void setCachLam(String cachLam) {
        this.cachLam = cachLam;
    }

    public LoaiMonAn getLoaiMonAn() {
        return loaiMonAn;
    }

    public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
        this.loaiMonAn = loaiMonAn;
    }

    public List<CongThuc> getCongThucList() {
        return congThucList;
    }

    public void setCongThucList(List<CongThuc> congThucList) {
        this.congThucList = congThucList;
    }
}
