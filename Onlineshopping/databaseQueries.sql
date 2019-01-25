CREATE TABLE CATEGORY(
   id int auto_increment,
   name varchar(50),
   description varchar(255),
   image_url varchar(50),
   is_active BOOLEAN,
   
   CONSTRAINT pk_category_id PRIMARY KEY(id)

);




//second table

CREATE TABLE user_detail(
  id int auto_increment,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  role VARCHAR(50),
  enabled BOOLEAN,
  password VARCHAR(50),
  email VARCHAR(100),
  contact_number VARCHAR(15),
  CONSTRAINT pk_user_id PRIMARY KEY(id)


);

INSERT INTO user_detail
(first_name,last_name,role,enabled,password,email,contact_number)
VALUES('Shiddu','M','ADMIN',true,'admin','sh@gmail.com','9845351233');

INSERT INTO user_detail
(first_name,last_name,role,enabled,password,email,contact_number)
VALUES('Shiva','B','SUPPLIER',true,'shivu','shivu@gmail.com','9538763658');

INSERT INTO user_detail
(first_name,last_name,role,enabled,password,email,contact_number)
VALUES('Kiran','B','SUPPLIER',true,'kiran','kiran@gmail.com','8792226865');



//third table

CREATE TABLE product(
     id INT AUTO_INCREMENT,
     code VARCHAR(20),
     name VARCHAR(50),
     brand VARCHAR(50),
     description VARCHAR(255),
     unit_price DECIMAL(10,2),
     quantity INT,
     is_active BOOLEAN,
     category_id INT,
     supplier_id INT,
     purchases INT DEFAULT 0,
     views INT DEFAULT 0,
     CONSTRAINT pk_product_id PRIMARY KEY(id),
     CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
     CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail (id)
     
  );
  
  
  

