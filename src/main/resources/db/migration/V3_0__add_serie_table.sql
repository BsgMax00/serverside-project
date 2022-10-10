create sequence serie_seq start with 1 increment by 1;
create table serie
(
    id integer not null,
    name varchar(255) not null,
    primary key (id)
)