CREATE TABLE users
(
    username varchar(15) not null primary key,
    password varchar(50),
    enabled  boolean     not null default true
);
CREATE TABLE authorities
(
    username  varchar(15),
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key (username) references users (username)
);
create unique index ix_auth_username on authorities (username, authority);