package com.carloslonghi.tonalista.repositories;

import com.carloslonghi.tonalista.entities.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemListRepository extends JpaRepository<ItemList, Long> {

}
