# Write your MySQL query statement below

select employee_id, if(employee_id % 2 !=0 AND name NOT like "M%", salary,0) as bonus from employees order by employee_id;