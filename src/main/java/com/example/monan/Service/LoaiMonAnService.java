package com.example.monan.Service;

import com.example.monan.Model.LoaiMonAn;
import com.example.monan.Repository.LoaiMonAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiMonAnService implements ILoaiMonAnService{
    @Autowired
    public LoaiMonAnRepository loaiMonAnRepository;

    @Override
    public LoaiMonAn themLoaiMonAn(LoaiMonAn loaiMonAn) {
        loaiMonAnRepository.save(loaiMonAn);
        return loaiMonAn;
    }
}
