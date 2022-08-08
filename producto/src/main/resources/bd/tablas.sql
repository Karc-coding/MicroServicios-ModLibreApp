create table if not exists authors (
    id serial primary key,
    first_name varchar(50),
    last_name varchar(50),
    nickname varchar(60) not null
);

create table if not exists categories (
    id serial primary key,
    name varchar(75) not null unique
);

create table if not exists books (
    id bigserial primary key,
    title varchar(125) not null,
    serie varchar(7) not null unique,
    year_book varchar(4),
    categories_id integer not null,
    price double precision not null,
    stock integer not null,
    authors_id integer not null,
    foreign key(categories_id) references categories(id),
    foreign key(authors_id) references authors(id)
);