INSERT INTO authors(id, first_name, last_name, nickname)
	VALUES	(DEFAULT, 'Albert', 'Flores', 'Khaliladonna'), (DEFAULT, 'Annette', 'Black', 'Annette Black'), (DEFAULT, 'Arlene', 'McCoy', 'Juliese'), (DEFAULT, 'Bessie', 'Cooper', 'Bessie Cooper'),
            (DEFAULT, 'Brooklyn', 'Simmons', 'Filber'), (DEFAULT, 'Cameron', 'Williamson', 'Marlon'), (DEFAULT, NULL, NULL, 'Lonatar'), (DEFAULT, 'Courtney', 'Henry', 'Therny'),
            (DEFAULT, NULL, NULL, 'Becky'), (DEFAULT, 'Darrell', 'Steward', 'Darrell Steward'), (DEFAULT, 'Devon', 'Lane', 'Devon Lane'), (DEFAULT, 'Dianne', 'Russell', 'Kunial'),
            (DEFAULT, 'Eleanor', 'Pena', 'Fikianna'), (DEFAULT, 'Esther', 'Howard', 'Tessiusa'), (DEFAULT, NULL, NULL, 'Coriann'), (DEFAULT, 'Guy', 'Hawkins', 'Guy Hawkins'),
            (DEFAULT, 'Jacob', 'Jones', 'Tarad'), (DEFAULT, 'Jane', 'Cooper', 'Ceyala'), (DEFAULT, 'Jenny', 'Wilson', 'Jenny Wilson'), (DEFAULT, 'Jerome', 'Bell', 'Heen'),
            (DEFAULT, 'Kathryn', 'Murphy', 'Kathryn Murphy'), (DEFAULT, 'Kristin', 'Watson', 'Koreya'), (DEFAULT, NULL, NULL, 'Nalianan'), (DEFAULT, 'Marvin', 'McKinney', 'Marvin MacKinney'),
            (DEFAULT, 'Ralph', 'Edwards', 'Thole'), (DEFAULT, 'Robert', 'Fox', 'Robert Fox'), (DEFAULT, NULL, NULL, 'Ronald Richards'), (DEFAULT, 'Savannah', 'Nguyen', 'Savannah'),
            (DEFAULT, 'Theresa', 'Webb', 'Theresa Webb'), (DEFAULT, 'Wade', 'Warren', 'Wade Warren'), (DEFAULT, 'Kevin', 'Rojas', 'Karc');

INSERT INTO categories(id, name)
	VALUES	(DEFAULT, 'Action and adventure'), (DEFAULT, 'Alternate history'), (DEFAULT, 'Anthology'), (DEFAULT, 'Children'), (DEFAULT, 'Classic'), (DEFAULT, 'Comics'),
            (DEFAULT, 'Coming-of-age'), (DEFAULT, 'Crime'), (DEFAULT, 'Drama'), (DEFAULT, 'Fairytale'), (DEFAULT, 'Fantasy'), (DEFAULT, 'Graphic novel'), (DEFAULT, 'Historical fiction'),
            (DEFAULT, 'Horror'), (DEFAULT, 'Mystery'), (DEFAULT, 'Poetry'), (DEFAULT, 'Political thriller'), (DEFAULT, 'Romance'), (DEFAULT, 'Satire'), (DEFAULT, 'Science fiction'),
            (DEFAULT, 'Short stories'), (DEFAULT, 'Suspense'), (DEFAULT, 'Teens'), (DEFAULT, 'Thriller'), (DEFAULT, 'Western'), (DEFAULT, 'Young adults');

INSERT INTO books(id, title, serie, year_book, categories_id, price, stock, authors_id)
	VALUES 	(DEFAULT, 'Wutherings Heights', 'VJ21983', '1995', 13, 24.30, 75, NULL),
			(DEFAULT, 'Are You There, Vodka? It´s Me, Chelsea', 'VJ95847', '2014', NULL, 15.00, 150, 5),
			(DEFAULT, 'Great Expectations', 'VJ13090', NULL, 14, 54.20, 15, NULL),
			(DEFAULT, 'Collected Fiction', 'VJ65481', '1991', 24, 25.10, 49, 15),
			(DEFAULT, 'To Kill a Mockingbird', 'VJ26548', NULL, NULL, 35.50, 30, NULL),
			(DEFAULT, 'Where the Wild Things Are', 'VJ90982', NULL, 15, 45.20, 75, 8),
			(DEFAULT, 'One Hundred Years of Solitude ', 'VJ25461', '1953', 7, 102.00, 174, 24);