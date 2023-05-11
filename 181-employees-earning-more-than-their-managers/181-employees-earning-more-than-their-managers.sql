/* Write your PL/SQL query statement below */
SELECT e1.name as Employee from Employee e1
join Employee e2 on e1.managerId = e2.id
and e1.salary > e2.salary;