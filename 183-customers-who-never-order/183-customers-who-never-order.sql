# Write your MySQL query statement below
# select c.name as customers from customers c left join orders o ON c.id=o.customerId where o.customerId is null;

select name as Customers from customers where id not IN(select customerId from orders);