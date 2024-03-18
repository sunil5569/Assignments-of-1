-- select FIRST_NAME, LAST_NAME, POINTS,
--  POINTS*0.1 'Total' , state
-- FROM CUSTOMERS
-- where points >1000
-- order by state
-- order by state, first_name
-- order by state, last_name
-- order by state desc, last_name 
-- order by

select  first_name, birth_date,last_name, 
state,
points
from customers
-- order by birth_date desc

-- where state = 'fl' or state = 'va' or state = 'tx'
-- order by state 
-- where state in ('fl','tx','cA')

-- where points >= 100 and points <= 2000
-- where birth_date <= "1990-01-01" and points <= 2000

-- where points between 1000 and 2000 
-- where points >= 500 and points <= 2000
-- where points between 796 and 3000 -- and birth_date <= '1980-01-01' and birth_date >= '1990-01-01'

-- where first_name like 'r%'
-- where first_name like '%r'
-- where first_name like '_r%'
-- where first_name like '__v_'
-- where first_name like '%il%'
-- where first_name like '%fr%'
-- where first_name sounds like 'eleka'
-- where last_name like '%field%'
-- where last_name regexp 'field'
-- where last_name regexp '^r'
-- where last_name regexp 'y$'
-- where last_name regexp 'el$|^br'
-- where last_name regexp 'y$'
-- where last_name regexp '[g]e'  -- g followed by e
-- where last_name regexp '[gim]e'   -- g or i or m followed by e
-- where last_name regexp '[a-h]e'  -- a to h range follow by e
-- where last_name like'%a%a%'  -- name atlist contain 2 a