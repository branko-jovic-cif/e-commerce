DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id UUID DEFAULT random_uuid() NOT NULL PRIMARY KEY,
    name TEXT NOT NULL,
    surname TEXT NOT NULL
);
