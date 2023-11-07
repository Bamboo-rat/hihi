package com.example.monan.Controller;

import com.example.monan.Model.CongThuc;
import com.example.monan.Model.NguyenLieu;
import com.example.monan.Service.NguyenLieuService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NguyenLieuController {
    @Autowired
    public NguyenLieuService nguyenLieuService;
    @RequestMapping(value = "themnguyenlieu", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    private NguyenLieu themNguyenLieu(@RequestBody String  nguyenLieu)
    {
        Gson gson = new Gson();
        NguyenLieu nguyenLieu1 = gson.fromJson(nguyenLieu, NguyenLieu.class);
        return nguyenLieuService.themNguyenLieu(nguyenLieu1);
    }

}
