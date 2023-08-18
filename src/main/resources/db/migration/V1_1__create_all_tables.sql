CREATE SEQUENCE IF NOT EXISTS patients_id_seq
      start 1
      increment 1;

create table if not exists patients
(
      id bigint not null primary key,
      login varchar(255) unique not null,
      password varchar(255) not null
) ;

insert into patients(id, login, password)
values (-1, 'patient1', 'patient1' ) ,
       ( -2, 'patient2', 'patient2' ) ,
       (-3, 'patient3', 'patient3' ) ;

CREATE SEQUENCE IF NOT EXISTS tbl_products_seq
      start 1
      increment 1;

create table if not exists tbl_products
(
      /* id bigserial primary key, */
      id bigint primary key,
      name varchar(255) unique not null,
      price decimal(255) not null,
      deleted boolean
) ;