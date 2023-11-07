package com.example.monan.Service;

import com.example.monan.Model.CongThuc;
import com.example.monan.Model.MonAn;
import com.example.monan.Repository.MonAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonAnService implements  IMonAnService{
    @Autowired
    public MonAnRepository monAnRepository;

    @Override
    public MonAn themMonAn(MonAn monAn) {
        monAnRepository.save(monAn);
        return monAn;
    }

    @Override
    public MonAn xoaMonAntheoId(int id) {
        Optional<MonAn> monAn = monAnRepository.findById(id);
        if(monAn.isEmpty())
        {
            return  null;
        }
        monAnRepository.delete(monAn.get());
        return monAn.get();
    }

    @Override
    public MonAn timKiemTheoTenVaNguyenLieu(String tenMon, String tenNguyenLieu) {
        for (MonAn ma : monAnRepository.findAll())
        {
            if(ma.getTenMon().equalsIgnoreCase(tenMon))
            {
                List<CongThuc> congThucList = ma.getCongThucList();
                for(CongThuc a : congThucList)
                {
                    if(a.getNguyenLieu().getTenNL().equalsIgnoreCase(tenNguyenLieu))
                        return ma;
                }
            }
        }
        return null;
    }
}
