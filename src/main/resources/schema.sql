CREATE TABLE IF NOT EXISTS checklists (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  task_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (task_id) REFERENCES tasks(id)
);

CREATE TABLE IF NOT EXISTS tasks (
  task_id INT NOT NULL AUTO_INCREMENT,
  task_title VARCHAR(25),
  description VARCHAR(150),
  deadLine DATETIME NOT NULL,
  status VARCHAR(255) NOT NULL,
  user_id INT NOT NULL,
  PRIMARY KEY (task_id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS users (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(25) UNIQUE,
  email VARCHAR(255) UNIQUE,
  password VARCHAR(255)
  PRIMARY KEY (id)
);

