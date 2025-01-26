INSERT INTO tb_item_list (name) VALUES ('Lista de compras do Mês');
INSERT INTO tb_item_list (name) VALUES ('Lista para o Churrasco');


INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Arroz', 2.5, 'kg', 'PENDING', 'HIGH');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Feijão', 1.5, 'kg', 'PURCHASED', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Macarrão', 1.0, 'kg', 'PENDING', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Açúcar', 1.0, 'kg', 'PURCHASED', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Café', 0.5, 'kg', 'PENDING', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Óleo de soja', 1.0, 'l', 'PENDING', 'HIGH');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Leite', 2.0, 'l', 'PENDING', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Papel higiênico', 12.0, 'unidades', 'PENDING', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Sabão em pó', 1.0, 'kg', 'PENDING', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Desinfetante', 1.0, 'l', 'PURCHASED', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Tomate', 1.0, 'kg', 'PENDING', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Cebola', 1.0, 'kg', 'PENDING', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Alho', 0.2, 'kg', 'PENDING', 'HIGH');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Frango', 2.0, 'kg', 'PURCHASED', 'HIGH');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Carne bovina', 3.0, 'kg', 'PENDING', 'HIGH');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Cerveja', 6.0, 'l', 'PURCHASED', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Refrigerante', 2.0, 'l', 'PURCHASED', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Água mineral', 10.0, 'l', 'PENDING', 'LOW');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Laranja', 1.0, 'kg', 'PENDING', 'MEDIUM');
INSERT INTO tb_item (name, quantity, unit, status, priority) VALUES ('Banana', 1.0, 'kg', 'PURCHASED', 'LOW');


INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 5, 4);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 6, 5);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 7, 6);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 8, 7);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 9, 8);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (1, 10, 9);

INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 11, 0);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 12, 1);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 13, 2);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 14, 3);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 15, 4);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 16, 5);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 17, 6);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 18, 7);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 19, 8);
INSERT INTO tb_belonging (list_id, item_id, position) VALUES (2, 20, 9);