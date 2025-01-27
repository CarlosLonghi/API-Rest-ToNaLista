package com.carloslonghi.tonalista.repositories;

import com.carloslonghi.tonalista.entities.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ItemListRepository extends JpaRepository<ItemList, Long> {

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND item_id = :itemId")
    void updateBelongingPosition(Long listId, Long itemId, Integer newPosition);
}
