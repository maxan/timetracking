create table if not exists employee (
	id integer identity primary key,
	realname varchar(200),
	username varchar(50),
	unique (username)
);

create table if not exists workedhour (
	id integer identity primary key,
	employeeId integer,
	ammount int not null,
	datework date not null,
	foreign key (employeeId) references employee (id)
);