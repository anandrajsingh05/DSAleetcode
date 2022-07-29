# Write your MySQL query statement below
select c.name as customers from customers c left join orders o ON c.id=o.customerId where o.customerId is null;