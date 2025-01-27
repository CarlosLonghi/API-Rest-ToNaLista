package com.carloslonghi.tonalista.services;

import com.carloslonghi.tonalista.dto.ItemListDTO;
import com.carloslonghi.tonalista.entities.ItemList;
import com.carloslonghi.tonalista.projections.ItemMinProjection;
import com.carloslonghi.tonalista.repositories.ItemListRepository;
import com.carloslonghi.tonalista.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemListService {
    @Autowired
    private ItemListRepository itemListRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Transactional(readOnly = true)
    public List<ItemListDTO> findAll() {
        List<ItemList> result = itemListRepository.findAll();
        return result.stream().map(ItemListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<ItemMinProjection> list = itemRepository.searchByList(listId);
        ItemMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = destinationIndex > sourceIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            itemListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
