CREATE TABLE IF NOT EXISTS users (
	id SERIAL,
    description VARCHAR(100) NOT NULL,
	description2 VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS task (
    id SERIAL,
    description VARCHAR(100) NOT NULL,
	description2 VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id ) REFERENCES users(id)
);