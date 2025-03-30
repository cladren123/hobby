
CREATE TABLE users (
    id         INT AUTO_INCREMENT PRIMARY KEY,
    login_id    VARCHAR(50)  NOT NULL,
    password   VARCHAR(50)  NOT NULL,
    name       VARCHAR(50)  NOT NULL,
    email      VARCHAR(100) UNIQUE,
    phone      VARCHAR(20),
    created_at DATETIME
)