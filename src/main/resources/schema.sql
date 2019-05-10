create table if not exists Person
(

    name      varchar(50)  not null,
    nachname  varchar(50)  not null,
    exMaedels varchar(200) not null
);

create table if not exists Kunde
(

    id       long primary key auto_increment not null,
    name     varchar(50)                     not null,
    nachname varchar(50)                     not null

);

create table if not exists Wagen
(

    id       long primary key auto_increment not null,
    marke    varchar(50)                     not null,
    jahrgang number(4)                       not null,
    kunde    varchar(50)                     not null,
    kunde_id long,
    foreign key (kunde_id) references Kunde (id)
);


