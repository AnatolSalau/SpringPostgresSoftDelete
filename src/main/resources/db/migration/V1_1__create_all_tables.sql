CREATE SEQUENCE IF NOT EXISTS patients_id_seq
      start 1
      increment 1;

create table if not exists patients
(
      id bigint not null primary key,
      login varchar(255) unique not null,
      password varchar(255) not null,
      icon bytea,
      deleted boolean not null default false
) ;

insert into patients(id, login, password, icon, deleted)
values (-1, 'patient1', 'patient1', null, default) ,
       ( -2, 'patient2', 'patient2', null, default) ,
       (-3, 'patient3', 'patient3', null, default);
