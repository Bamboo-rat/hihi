package com.example.monan.Controller;

import com.example.monan.Model.CongThuc;
import com.example.monan.Model.MonAn;
import com.example.monan.Repository.MonAnRepository;
import com.example.monan.Service.CongThucService;
import com.example.monan.Service.MonAnService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CongThucController {
    @Autowired
    public CongThucService congThucService;
    @RequestMapping(value = "themcongthuc", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    private CongThuc themCongThuc(@RequestBody String congThuc)
    {
        Gson gson = new Gson();
        CongThuc congThuc1 = gson.fromJson(congThuc, CongThuc.class);
        return congThucService.themCongThuc(congThuc1);
    }

}
