CREATE DATABASE food_ordering_system;
USE food_ordering_system;
CREATE TABLE customer (   
	customer_id INT PRIMARY KEY,
	customerName VARCHAR(100),
    Phone VARCHAR(15),
    Address VARCHAR(250)
);
USE food_ordering_system;
CREATE TABLE Food (
	FoodID INT PRIMARY KEY,
    FoodName VARCHAR(100),
    Price DECIMAL(10,2)
 );
USE food_ordering_system; 
CREATE TABLE Orders (
	order_id INT PRIMARY KEY,
	customer_id INT,
	orderdate DATE,
	FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
 );    
 USE food_ordering_system;
 CREATE TABLE OrderDetails (
     orderDetail_id INT PRIMARY KEY,
     orderID INT,
     food_id INT,
     quantity INT
  );   
  INSERT INTO customer
  VALUES (1, 'Thanniya','9856789842','Kochi');
  INSERT INTO Food 
  VALUES (1, 'Burger',12.00);
  SELECT*FROM customer;
  SELECT*FROM Food;
  INSERT INTO customer VALUES (2, 'Meera', '9563657999', 'Kochi');
  INSERT INTO customer VALUES (3, 'Rahul', '9246765316', 'Calicut');
  INSERT INTO customer VALUES (4, 'Anu', '9825746797', 'Kollam');
  SELECT * FROM customer;
  USE food_ordering_system;
  CREATE TABLE menu (
    item_id INT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    category VARCHAR(50)
);
INSERT INTO menu (item_id, item_name, price, category)
VALUES
(1, 'Burger', 120, 'Fast Food'),
(2, 'Pizza', 250, 'Fast Food'),
(3, 'Fried Rice', 180, 'Main Course'),
(4, 'Ice Cream', 80, 'Dessert'),
(5, 'Sandwich', 100, 'Snack');