INSERT INTO app_user (name, email, password) VALUES
('John Doe', 'john.doe@gmail.com', 'Password123'),
('Jane Smith', 'jane.smith@gmail.com', 'SecurePass'),
('Mike Johnson', 'mike.johnson@gmail.com', 'MikePass'),
('Emily Davis', 'emily.davis@gmail.com', 'Emily123'),
('David Brown', 'david.brown@gmail.com', 'BrowniePass'),
('Sarah Wilson', 'sarah.wilson@gmail.com', 'SarahPass'),
('Chris Moore', 'chris.moore@gmail.com', 'ChrisPass'),
('Anna Taylor', 'anna.taylor@gmail.com', 'Anna123'),
('James Anderson', 'james.anderson@gmail.com', 'JamesPass'),
('Olivia Martinez', 'olivia.martinez@gmail.com', 'OliviaSecure'),
('Robert Thomas', 'robert.thomas@gmail.com', 'RobertPass'),
('Sophia White', 'sophia.white@gmail.com', 'Sophia123'),
('Daniel Harris', 'daniel.harris@gmail.com', 'DanielSecure'),
('Isabella Martin', 'isabella.martin@gmail.com', 'IsabellaPass'),
('Matthew Lee', 'matthew.lee@gmail.com', 'MattPass'),
('Charlotte Clark', 'charlotte.clark@gmail.com', 'Charlotte123'),
('Joseph Lewis', 'joseph.lewis@gmail.com', 'JosephPass'),
('Mia Walker', 'mia.walker@gmail.com', 'MiaSecure'),
('William Hall', 'william.hall@gmail.com', 'WilliamPass'),
('Ava Allen', 'ava.allen@gmail.com', 'Ava123');

INSERT INTO user_roles (user_id, roles) VALUES
(1, 'RIDER'),
(2, 'RIDER'), (2, 'DRIVER'),
(3, 'RIDER'), (3, 'DRIVER'),
(4, 'RIDER'), (4, 'DRIVER'),
(5, 'RIDER'), (5, 'DRIVER'),
(6, 'RIDER'), (6, 'DRIVER'),
(7, 'RIDER'), (7, 'DRIVER'),
(8, 'RIDER'), (8, 'DRIVER'),
(9, 'RIDER'), (9, 'DRIVER'),
(10, 'RIDER'), (10, 'DRIVER'),
(11, 'RIDER'), (11, 'DRIVER'),
(12, 'RIDER'), (12, 'DRIVER'),
(13, 'RIDER'), (13, 'DRIVER'),
(14, 'RIDER'), (14, 'DRIVER'),
(15, 'RIDER'), (15, 'DRIVER'),
(16, 'RIDER'), (16, 'DRIVER'),
(17, 'RIDER'), (17, 'DRIVER'),
(18, 'RIDER'), (18, 'DRIVER'),
(19, 'RIDER'), (19, 'DRIVER'),
(20, 'RIDER'), (20, 'DRIVER');

INSERT INTO rider (user_id, rating) VALUES (1, '4.9');


INSERT INTO driver (user_id, rating, available, current_location) VALUES
(2, 4.7, true, ST_GeomFromText('POINT(77.1025 28.7041)', 4326)),
(3, 4.5, true, ST_GeomFromText('POINT(77.2167 28.6692)', 4326)),
(4, 4.8, false, ST_GeomFromText('POINT(77.0689 28.4595)', 4326)),
(5, 4.6, true, ST_GeomFromText('POINT(77.4989 28.4089)', 4326)),
(6, 4.9, true, ST_GeomFromText('POINT(77.3910 28.5355)', 4326)),
(7, 4.4, false, ST_GeomFromText('POINT(77.2813 28.6139)', 4326)),
(8, 4.3, true, ST_GeomFromText('POINT(77.1723 28.6448)', 4326)),
(9, 4.7, true, ST_GeomFromText('POINT(77.0406 28.4744)', 4326)),
(10, 4.5, false, ST_GeomFromText('POINT(77.3027 28.7045)', 4326)),
(11, 4.6, true, ST_GeomFromText('POINT(77.3056 28.6735)', 4326)),
(12, 4.8, true, ST_GeomFromText('POINT(77.1291 28.6988)', 4326)),
(13, 4.2, false, ST_GeomFromText('POINT(77.2507 28.7041)', 4326)),
(14, 4.9, true, ST_GeomFromText('POINT(77.1025 28.5275)', 4326)),
(15, 4.4, true, ST_GeomFromText('POINT(77.3421 28.5983)', 4326)),
(16, 4.3, false, ST_GeomFromText('POINT(77.2285 28.5545)', 4326)),
(17, 4.7, true, ST_GeomFromText('POINT(77.2146 28.6136)', 4326)),
(18, 4.5, true, ST_GeomFromText('POINT(77.1926 28.6121)', 4326)),
(19, 4.6, false, ST_GeomFromText('POINT(77.3068 28.6472)', 4326)),
(20, 4.8, true, ST_GeomFromText('POINT(77.2528 28.6283)', 4326));


INSERT INTO wallet (user_id, balance) VALUES (1, 100), (2, 500);
