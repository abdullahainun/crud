CREATE TABLE user (
   id BIGINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30) NOT NULL,
   age  INTEGER NOT NULL,
   salary REAL NOT NULL,
   CONSTRAINT pk_user
   PRIMARY KEY (id)
);
   
INSERT INTO user(name, age, salary) VALUES ('Sam', 27, 1500);
INSERT INTO user(name, age, salary) VALUES ('Tom', 21, 3000);