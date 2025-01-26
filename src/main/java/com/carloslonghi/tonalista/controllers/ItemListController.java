package com.carloslonghi.tonalista.controllers;

import com.carloslonghi.tonalista.dto.ItemListDTO;
import com.carloslonghi.tonalista.dto.ItemMinDTO;
import com.carloslonghi.tonalista.services.ItemListService;
import com.carloslonghi.tonalista.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ItemListController {

    @Autowired
    private ItemListService itemListService;

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemListDTO> findAll() {
        return itemListService.findAll();
    }

    @GetMapping(value = "/{listId}/items")
    public List<ItemMinDTO> findByList(@PathVariable Long listId) {
        return itemService.findByList(listId);
    }
}
