/* Write your PL/SQL query statement below */
select customers.name as Customers from Customers 
left join orders on Customers.id=orders.customerID 
where Orders.customerID is null;