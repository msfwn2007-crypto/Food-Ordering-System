DROP DATABASE food_ordering_system;
CREATE DATABASE food_ordering_system;
USE food_ordering_system;
CREATE TABLE Menu (
    food_id INT PRIMARY KEY AUTO_INCREMENT,
    food_name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10,2) NOT NULL,
    description VARCHAR(255),
    availability VARCHAR(20) DEFAULT 'Available'
);
INSERT INTO Menu (food_name, category, price, description, availability) VALUES
('Burger', 'Fast Food', 120.00, 'Chicken burger with cheese', 'Available'),
('Pizza', 'Fast Food', 250.00, 'Cheese burst pizza', 'Available'),
('Fried Rice', 'Chinese', 150.00, 'Veg fried rice', 'Available'),
('Noodles', 'Chinese', 130.00, 'Spicy noodles', 'Available'),
('Parotta', 'South Indian', 20.00, 'Kerala parotta', 'Available'),
('Dosa', 'South Indian', 40.00, 'Crispy dosa with chutney', 'Available');
SELECT * FROM Menu;