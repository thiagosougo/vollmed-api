use vollmed_api;
alter table doctors add active tinyint;
update doctors set active = 1;
