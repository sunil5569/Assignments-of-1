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

-- where first_name like 'r%' 		-- 1st name start with r
-- where first_name like '%r'		-- 1st name ends with r
-- where first_name like '_r%' 		-- 2nd letter r 
-- where first_name like '__v_' 	-- name having 4 letter and 'v' at 3rd location
-- where first_name like '%il%'    	-- first name contain il
-- where first_name like '%fr%' 	-- first name contain fr
-- where first_name sounds like 'eleka' -- serch with pronouncetion
-- where last_name like '%field%' 	-- contain filed ant start or end
-- where last_name regexp 'field' 	-- it will regulate field 
-- where last_name regexp '^r' 		-- starts with r 
-- where last_name regexp 'y$' 		-- ends with y
-- where last_name regexp 'el$|^br' -- endes with el & starts with br
-- where last_name regexp 'y$'   	-- ended bt y
-- where last_name regexp '[g]e'  	-- g followed by e
-- where last_name regexp '[gim]e'  -- g or i or m followed by e
-- where last_name regexp '[a-h]e'  -- a to h range follow by e
-- where last_name like'%a%a%'  	-- name atlist contain 2 a