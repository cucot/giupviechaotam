CREATE TABLE user
(
    id int auto_increment primary key,
    username varchar(15) not null,
    password varchar(255),
    roles varchar(255),
    enabled  boolean not null default true
);
/*
 CREATE TABLE authorities
  (
      username  varchar(15),
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key (username) references user (username)
  );
 create unique index ix_auth_username on authorities (username, authority);
 */