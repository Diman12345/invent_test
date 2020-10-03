package main.java.com.diman.api.mobilecom.controller;

import main.java.com.diman.api.mobilecom.BarangRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/test_core")
public class BarangController {

    @Autowired
    BarangRepo barangRepo;

    @GetMapping("/get_product")
    public List<model.Barang> getAll(){
        return barangRepo.findAll();
    }
}
