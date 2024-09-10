create table tile (
    id varchar primary key unique not null,
    height float not null,
    width float not null,
    gap float not null,
    depth float not null
);

create table room (
    id varchar primary key unique not null,
    height float not null,
    width float not null,
    depth float
);