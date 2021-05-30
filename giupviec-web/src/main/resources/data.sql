INSERT INTO USERS (username, password, enabled)
VALUES ('admin', 'notyou', true),
        ('cucot', 'notme', true),
        ('user', 'user', true);

INSERT INTO AUTHORITIES(username, authority)
VALUES ('admin', 'ROLE_ADMIN'),
        ('cucot', 'ROLE_USER'),
       ('user', 'ROLE_USER');