package com.example.monan.Service;

import com.example.monan.Model.MonAn;

public interface IMonAnService {
    public MonAn themMonAn(MonAn monAn);
    public MonAn xoaMonAntheoId(int id);
    public MonAn timKiemTheoTenVaNguyenLieu(String tenMon, String tenNguyenLieu);
}
