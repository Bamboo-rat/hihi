package com.example.monan.Service;

import com.example.monan.Model.CongThuc;
import com.example.monan.Model.MonAn;
import com.example.monan.Model.NguyenLieu;
import com.example.monan.Repository.CongThucRepository;
import com.example.monan.Repository.MonAnRepository;
import com.example.monan.Repository.NguyenLieuRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CongThucService implements ICongThucService{
    @Autowired
    public CongThucRepository congThucRepository;
    @Autowired
    public MonAnRepository monAnRepository;
    @Autowired
    public MonAnService monAnService;
    @Autowired
    public NguyenLieuRepository nguyenLieuRepository;
    @Override
    public CongThuc themCongThuc(CongThuc congThuc) {
        congThucRepository.save(congThuc);
        Optional<MonAn> monAn = monAnRepository.findById(congThuc.getIdMA());
        MonAn monAnCapNhat = monAn.get();
        StringBuilder hihi = new StringBuilder(monAnCapNhat.getCachLam());
        if(hihi.length()>0)
        {
            hihi.append("\n");
        }
        Optional<NguyenLieu> nguyenLieu = nguyenLieuRepository.findById(congThuc.getIdNL());
        NguyenLieu nguyenLieu1 = nguyenLieu.get();
        hihi.append(nguyenLieu1.getTenNL()).append(" : ").append(congThuc.getSoLuong()).append(" ").append(congThuc.getDonViTinh());
        monAnCapNhat.setCachLam(hihi.toString());
        monAnRepository.save(monAnCapNhat);
        return congThuc;
    }
}
