package com.example.monan.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "loaimonan")
public class LoaiMonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoaiMonAnID")
    private int idLMA;
    @Column(name = "TenLoai")
    @Size(max = 20)
    private String tenLoai;
    @Column(name = "moTa")
    private String mota;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "loaiMonAn",cascade = CascadeType.ALL)
    List<MonAn> monAnList;

    public int getIdLMA() {
        return idLMA;
    }

    public void setIdLMA(int idLMA) {
        this.idLMA = idLMA;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public List<MonAn> getMonAnList() {
        return monAnList;
    }

    public void setMonAnList(List<MonAn> monAnList) {
        this.monAnList = monAnList;
    }
}
