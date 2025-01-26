package com.carloslonghi.tonalista.controllers;

import com.carloslonghi.tonalista.dto.ItemListDTO;
import com.carloslonghi.tonalista.services.ItemListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ItemListController {

    @Autowired
    private ItemListService itemListService;

    @GetMapping
    public List<ItemListDTO> findAll() {
        return itemListService.findAll();
    }
}
