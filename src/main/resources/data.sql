merge into employee
using (values('john.muler', 'John Muler'), ('kate.spancer', 'Kate Spancer'), ('anderson.silva', 'Anderson Silva'))
	as novos(username, realname) ON employee.username = novos.username
when not matched then insert values (null, novos.realname, novos.username);