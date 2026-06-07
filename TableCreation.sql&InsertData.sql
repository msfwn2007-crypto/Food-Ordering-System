USE food_ordering_db;
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50),
    password VARCHAR(50),
    phone VARCHAR(15)
);
USE food_ordering_db;
INSERT INTO Users (name, email, password, phone)
VALUES (
    'Alia',
    'alia@gmail.com',
    'password123',
    '8111882929'
);
SELECT * FROM Users;