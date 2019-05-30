CREATE TABLE IF NOT EXISTS author
(
    id                INT          NOT NULL AUTO_INCREMENT,
    username          VARCHAR(255) NOT NULL,
    password          VARCHAR(255) NOT NULL,
    email             VARCHAR(255) NOT NULL,
    bio               BLOB,
    favourite_section VARCHAR(25),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS blog
(
    id        INT NOT NULL AUTO_INCREMENT,
    author_id INT NOT NULL,
    title     VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS post
(
    id         INT          NOT NULL AUTO_INCREMENT,
    blog_id    INT,
    author_id  INT          NOT NULL,
    created_on TIMESTAMP    NOT NULL,
    section    VARCHAR(25)  NOT NULL,
    subject    VARCHAR(255) NOT NULL,
    body       LONGBLOB     NOT NULL,
    draft      INT          NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (blog_id) REFERENCES blog (id)
);


CREATE TABLE IF NOT EXISTS tag
(
    id   INT          NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS post_tag
(
    post_id INT NOT NULL,
    tag_id  INT NOT NULL,
    PRIMARY KEY (post_id, tag_id)
);

CREATE TABLE IF NOT EXISTS comment
(
    id      INT          NOT NULL AUTO_INCREMENT,
    post_id INT          NOT NULL,
    name    VARCHAR(255) NOT NULL,
    comment LONGTEXT     NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS node
(
    id        INT NOT NULL,
    parent_id INT,
    PRIMARY KEY (id)
);