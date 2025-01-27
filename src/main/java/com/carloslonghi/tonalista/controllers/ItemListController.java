package com.carloslonghi.tonalista.controllers;

import com.carloslonghi.tonalista.dto.ItemListDTO;
import com.carloslonghi.tonalista.dto.ItemMinDTO;
import com.carloslonghi.tonalista.dto.ReplacementDTO;
import com.carloslonghi.tonalista.services.ItemListService;
import com.carloslonghi.tonalista.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        itemListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
