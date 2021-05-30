INSERT INTO USER (username, password, roles, enabled)
VALUES ('admin', 'notyou', 'ROLE_ADMIN', true),
        ('cucot', 'notme', 'ROLE_USER', true),
        ('sale', 'sale', 'ROLE_USER,ROLE_SALE', true);

/* INSERT INTO AUTHORITIES(username, authority)
VALUES ('admin', 'ROLE_ADMIN'),
        ('cucot', 'ROLE_USER'),
       ('user', 'ROLE_USER');
 */