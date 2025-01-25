package com.carloslonghi.tonalista.controllers;

import com.carloslonghi.tonalista.dto.ItemDTO;
import com.carloslonghi.tonalista.dto.ItemMinDTO;
import com.carloslonghi.tonalista.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/{id}")
    public ItemDTO findById(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @GetMapping
    public List<ItemMinDTO> findAll() {
        return itemService.findAll();
    }
}
