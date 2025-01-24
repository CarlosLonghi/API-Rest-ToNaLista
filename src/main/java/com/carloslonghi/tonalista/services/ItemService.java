package com.carloslonghi.tonalista.services;

import com.carloslonghi.tonalista.dto.ItemMinDTO;
import com.carloslonghi.tonalista.entities.Item;
import com.carloslonghi.tonalista.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    public List<ItemMinDTO> findAll() {
        List<Item> result = itemRepository.findAll();
        return result.stream().map(ItemMinDTO::new).toList();
    }
}
