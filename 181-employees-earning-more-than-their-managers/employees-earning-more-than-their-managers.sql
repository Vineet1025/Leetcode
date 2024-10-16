# Write your MySQL query statement below
Select d.name as Employee from Employee e join Employee d on e.id = d.managerId and d.salary>e.salary;