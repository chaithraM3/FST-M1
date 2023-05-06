REM   Script: IBM SDEL SQL-Activity 7
REM   Activity7

select sum(purchase_amount) as total_amount
from orders;

select avg(purchase_amount) as average
from orders;

select max(purchase_amount) as Max_amount
from orders;

select min(purchase_amount) as Min_amount
from orders;

select count(distinct salesman_id) from orders;
