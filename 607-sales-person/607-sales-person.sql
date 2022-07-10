# Write your MySQL query statement below
select name from salesperson where sales_id NOT IN(select o.sales_id from orders o inner join company c ON o.com_id=c.com_id where c.name="RED");