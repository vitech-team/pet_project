create sequence hibernate_sequence;

create table dev_flow_sample_user
(
  id            bigint not null
    constraint dev_flow_sample_user_pkey
      primary key,
  date_of_visit timestamp,
  request_url   varchar(255),
  username      varchar(255)
);

