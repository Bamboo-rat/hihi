package com.example.monan.Service;

import com.example.monan.Model.NguyenLieu;
import com.example.monan.Repository.NguyenLieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguyenLieuService implements INguyenLieuService{
    @Autowired
    public NguyenLieuRepository nguyenLieuRepository;

    @Override
    public NguyenLieu themNguyenLieu(NguyenLieu nguyenLieu) {
        nguyenLieuRepository.save(nguyenLieu);
        return  nguyenLieu;
    }
}
