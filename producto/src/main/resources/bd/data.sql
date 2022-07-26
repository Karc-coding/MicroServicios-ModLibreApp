INSERT INTO authors(id, first_name, last_name, nickname)
	VALUES	(1, 'Albert', 'Flores', 'Khaliladonna'), (2, 'Annette', 'Black', 'Annette Black'), (3, 'Arlene', 'McCoy', 'Juliese'), (4, 'Bessie', 'Cooper', 'Bessie Cooper'),
            (5, 'Brooklyn', 'Simmons', 'Filber'), (6, 'Cameron', 'Williamson', 'Marlon'), (7, NULL, NULL, 'Lonatar'), (8, 'Courtney', 'Henry', 'Therny'),
            (9, NULL, NULL, 'Becky'), (10, 'Darrell', 'Steward', 'Darrell Steward'), (11, 'Devon', 'Lane', 'Devon Lane'), (12, 'Dianne', 'Russell', 'Kunial'),
            (13, 'Eleanor', 'Pena', 'Fikianna'), (14, 'Esther', 'Howard', 'Tessiusa'), (15, NULL, NULL, 'Coriann'), (16, 'Guy', 'Hawkins', 'Guy Hawkins'),
            (17, 'Jacob', 'Jones', 'Tarad'), (18, 'Jane', 'Cooper', 'Ceyala'), (19, 'Jenny', 'Wilson', 'Jenny Wilson'), (20, 'Jerome', 'Bell', 'Heen'),
            (21, 'Kathryn', 'Murphy', 'Kathryn Murphy'), (22, 'Kristin', 'Watson', 'Koreya'), (23, NULL, NULL, 'Nalianan'), (24, 'Marvin', 'McKinney', 'Marvin MacKinney'),
            (25, 'Ralph', 'Edwards', 'Thole'), (26, 'Robert', 'Fox', 'Robert Fox'), (27, NULL, NULL, 'Ronald Richards'), (28, 'Savannah', 'Nguyen', 'Savannah'),
            (29, 'Theresa', 'Webb', 'Theresa Webb'), (30, 'Wade', 'Warren', 'Wade Warren'), (31, 'Kevin', 'Rojas', 'Karc') ON CONFLICT (id) DO NOTHING;

INSERT INTO categories(id, name)
	VALUES	(1, 'Action and adventure'), (2, 'Alternate history'), (3, 'Anthology'), (4, 'Children'), (5, 'Classic'), (6, 'Comics'),
            (7, 'Coming-of-age'), (8, 'Crime'), (9, 'Drama'), (10, 'Fairytale'), (11, 'Fantasy'), (12, 'Graphic novel'), (13, 'Historical fiction'),
            (14, 'Horror'), (15, 'Mystery'), (16, 'Poetry'), (17, 'Political thriller'), (18, 'Romance'), (19, 'Satire'), (20, 'Science fiction'),
            (21, 'Short stories'), (22, 'Suspense'), (23, 'Teens'), (24, 'Thriller'), (25, 'Western'), (26, 'Young adults') ON CONFLICT (id) DO NOTHING;

--INSERT INTO books(id, title, serie, year_book, categories_id, price, stock, authors_id)
--	VALUES 	(1, 'Wutherings Heights', 'VJ21983', '1995', 13, 24.30, 75, 4),
--			(2, 'Are You There, Vodka? It´s Me, Chelsea', 'VJ95847', '2014', 5, 15.00, 150, 5),
--			(3, 'Great Expectations', 'VJ13090', NULL, 14, 54.20, 15, 10),
--			(4, 'Collected Fiction', 'VJ65481', '1991', 24, 25.10, 49, 15),
--			(5, 'To Kill a Mockingbird', 'VJ26548', NULL, 9, 35.50, 30, 17),
--			(6, 'Where the Wild Things Are', 'VJ90982', NULL, 15, 45.20, 75, 8),
--			(7, 'One Hundred Years of Solitude ', 'VJ25461', '1953', 7, 102.00, 174, 24) ON CONFLICT (id) DO NOTHING;