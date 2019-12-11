package com.example.demo.Controller;

import com.example.demo.Domain.DefaultPieceFreight;
import com.example.demo.Domain.SpecialFreight;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
@RestController
@RequestMapping("/admin-freightSerice")// /wx/order

public interface FreightController {


    @GetMapping("/defaultFreights")
    public Object getDefaultFreights();


    @GetMapping("/specialFreight")
    public Object getSpecialFreight();


    @PostMapping("/defaultFreights")
    public Object addDefaultFreights(DefaultPieceFreight defaultPieceFreight);

    @PostMapping("/specialFreight")
    public Object addSpecialFreight(SpecialFreight specialFreight);

    @DeleteMapping("/defaultFreights/{id}")
    public Object deleteDefaultFreight(@PathVariable Integer id);

    @DeleteMapping("/specialFreights/{id}")
    public Object deleteSpecialFreight(@PathVariable Integer id);

    @PutMapping("/specialFreights/{id}")
    public Object updateSpecialFreight(@PathVariable Integer id,@RequestBody SpecialFreight specialFreight);

    @DeleteMapping("/defaultFreights/{id}")
    public Object updateDefaultFreight(@PathVariable Integer id,@RequestBody DefaultPieceFreight defaultPieceFreight);

    @GetMapping("/freight/{orderid}")
    public Integer getFreight(@PathVariable("orderid") String orderId);
}