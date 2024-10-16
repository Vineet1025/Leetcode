SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Address
RIGHT JOIN person
ON Address.personId = person.personId; 