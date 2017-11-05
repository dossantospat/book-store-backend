--liquibase formatted sql

--changeset initialisation:1
CREATE TABLE author (id SERIAL PRIMARY KEY, firstname VARCHAR(255) NOT NULL, lastname VARCHAR(512) NOT NULL);
-- rollback drop table author
CREATE TABLE book (id SERIAL PRIMARY KEY, title VARCHAR(255) NOT NULL, description VARCHAR(512) NOT NULL, author_id INTEGER);
-- rollback drop table book
ALTER TABLE book ADD CONSTRAINT book_author_fk FOREIGN KEY (author_id) REFERENCES author;
