CREATE TABLE users (
    id VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100),
    profile_image MEDIUMBLOB,
    PRIMARY KEY(id)
);