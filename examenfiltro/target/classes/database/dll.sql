DROP DATABASE IF EXISTS filtroSpring;

CREATE DATABASE filtroSpring;

USE filtroSpring;

CREATE TABLE country(
    codecountry VARCHAR(5) PRIMARY KEY,
    nameCountry VARCHAR(100)
);

CREATE TABLE region(
    codereg VARCHAR(5) PRIMARY KEY,
    namereg VARCHAR(100),
    codecountry VARCHAR(5),
    CONSTRAINT FOREIGN KEY codecountry REFERENCES country(codecountry)
);

CREATE TABLE city(
    codecity VARCHAR(5) PRIMARY KEY,
    namecity VARCHAR(50),
    codereg VARCHAR(5),
    CONSTRAINT FOREIGN KEY codereg REFERENCES region(codereg)
);