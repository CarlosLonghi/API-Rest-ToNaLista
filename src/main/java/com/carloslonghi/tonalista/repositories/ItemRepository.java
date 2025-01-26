package com.carloslonghi.tonalista.repositories;

import com.carloslonghi.tonalista.entities.Item;
import com.carloslonghi.tonalista.projections.ItemMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query(nativeQuery = true, value = """
        SELECT tb_item.id, tb_item.name, tb_item.quantity, tb_item.unit, tb_item.priority, tb_item.status, tb_belonging.position
        FROM tb_item
        INNER JOIN tb_belonging ON tb_item.id = tb_belonging.item_id
        WHERE tb_belonging.list_id = :listId
        ORDER BY tb_belonging.position
        """)
    List<ItemMinProjection> searchByList(Long listId);

}
