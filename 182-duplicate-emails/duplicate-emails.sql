# Write your MySQL query statement below
select email as Email from person 
GROUP BY Email HAVING count(*)>1;