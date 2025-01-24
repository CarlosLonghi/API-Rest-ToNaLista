package com.carloslonghi.tonalista.repositories;

import com.carloslonghi.tonalista.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
