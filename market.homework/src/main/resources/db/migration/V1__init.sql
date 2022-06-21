--create table products
-- (
--     id    bigserial primary key,
--     title varchar(255),
--     price int
-- );
-- insert into products (title, price)
-- values ('Bread', 25),
--        ('Milk', 80),
--        ('Cheese', 450);




create table categories
(
    id    bigserial primary key,
    title varchar(255)
);
insert into categories (title)
values ('Food');

create table products
(
    id          bigserial primary key,
    title       varchar(255),
    price       int,
    category_id bigint references categories (id)
);
insert into products (title, price, category_id)
values ('Bread', 25, 1),
       ('Milk', 80, 1),
       ('Cheese', 450, 1),
       ('Orange', 24, 1),
       ('Meat', 300, 1),
       ('Water', 50, 1),
       ('Grape', 25, 1),
       ('Fish', 300, 1),
       ('Chicken', 50, 1),
       ('Banana', 20, 1),
       ('Avocado', 60, 1),
       ('Pizza', 150, 1),
       ('Sugar', 70, 1),
       ('Jam', 100, 1),
       ('Pepsi', 50, 1),
       ('Peach', 20, 1),
       ('Potato', 80, 1),
       ('Butter', 150, 1);