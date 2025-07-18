create table if not exists contact(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    first_name VARCHAR,
    company VARCHAR,
);