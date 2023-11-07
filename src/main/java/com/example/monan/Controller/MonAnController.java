package com.example.monan.Controller;

import com.example.monan.Model.MonAn;
import com.example.monan.Model.NguyenLieu;
import com.example.monan.Service.MonAnService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MonAnController {
    @Autowired
    public MonAnService monAnService;
    @RequestMapping(value = "themmonan", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    private MonAn themMonAn(@RequestBody String  monAn)
    {
        Gson gson = new Gson();
        MonAn monAn1 = gson.fromJson(monAn, MonAn.class);
        return monAnService.themMonAn(monAn1);
    }
    @RequestMapping(value = "xoamonan", method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    private MonAn xoaMonAntheoId(@RequestParam int id)
    {
        return monAnService.xoaMonAntheoId(id);
    }
    @RequestMapping(value = "xoamonan", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    private  MonAn timKiemTheoTenVaNguyenLieu(@RequestParam String tenMon, String tenNguyenLieu)
    {
        return monAnService.timKiemTheoTenVaNguyenLieu(tenMon,tenNguyenLieu);
    }
}
