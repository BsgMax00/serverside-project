create sequence awards_seq start with 1 increment by 1;
create table awards
(
    id      integer         not null,
    title   varchar(255)    not null,
    info    varchar(255)    not null,
    primary key (id)
);