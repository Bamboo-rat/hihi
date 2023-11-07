package com.example.monan.Controller;

import com.example.monan.Model.CongThuc;
import com.example.monan.Model.LoaiMonAn;
import com.example.monan.Service.LoaiMonAnService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoaiMonAnController {
    @Autowired
    public LoaiMonAnService loaiMonAnService;
    @RequestMapping(value = "themloaimonan", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    private LoaiMonAn themLoaiMonAn(@RequestBody String loaiMonAn)
    {
        Gson gson = new Gson();
        LoaiMonAn loaiMonAn1 = gson.fromJson(loaiMonAn, LoaiMonAn.class);
        return loaiMonAnService.themLoaiMonAn(loaiMonAn1);
    }
}
