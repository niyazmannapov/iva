drop table if exists practice.skills;
drop schema if exists practice;

create schema practice;

create table practice.skills
(
    id     BIGINT IDENTITY PRIMARY KEY,
    name   varchar(255),
    points int
);