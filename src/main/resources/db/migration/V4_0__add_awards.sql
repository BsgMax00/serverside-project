create sequence awards_seq start with 1 increment by 1;
create table awards
(
    id      integer         ,
    title   varchar(255)    ,
    info    varchar(255)    ,
    primary key (id)
);