package com.carloslonghi.tonalista.services;

import com.carloslonghi.tonalista.dto.ItemListDTO;
import com.carloslonghi.tonalista.entities.ItemList;
import com.carloslonghi.tonalista.repositories.ItemListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemListService {
    @Autowired
    private ItemListRepository itemListRepository;

    @Transactional(readOnly = true)
    public List<ItemListDTO> findAll() {
        List<ItemList> result = itemListRepository.findAll();
        return result.stream().map(ItemListDTO::new).toList();
    }
}
