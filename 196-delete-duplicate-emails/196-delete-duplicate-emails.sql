# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

delete a
from person a join person b
where a.id > b.id and a.email = b.email;