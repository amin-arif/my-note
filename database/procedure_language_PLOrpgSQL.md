[1]  DOLLAR-QUOTED STRING CONSTANTS
	
	select $$I'm a string constant that contains a backslash \$$;
	select $tag$I'm a string constant that contains a backslash \$tag$; -- tag is optional


[2] CREATE FUNCTION:

	create function function_name(param_list) 
		returns datatype
	language lang_name
	as 
	 'function_body'
	 
 EXAMPLE:
	 create function find_film_by_id(
	   id int
	) returns film 
	language sql
	as 
	$$
	  select * from film 
	  where film_id = id;  
	$$; 


[3] CREATE STORED PROCEDURE:

	create procedure proc_name(param_list)
	language lang_name
	as $$
	  -- stored procedure body
	$$
	
	
4. PL/pgSQL is a block-structured language, therefore, a PL/pgSQL function or stored procedure is organized into blocks.

The following illustrates the syntax of a complete block in PL/pgSQL:
	[ <<label>> ]
	[ declare
		declarations ]
	begin
		statements;
		...
	end [ label ];
	
EXAMPLE: (label is optional)
	do $$ 
	<<first_block>> 
	declare
	  film_count integer := 0;
	begin
	   -- get the number of films
	   select count(*) 
	   into film_count
	   from film;
	   -- display a message
	   raise notice 'The number of films is %', film_count;
	end first_block $$;

Note: DO statement does not belong to the block. It is used to execute an anonymous block.


5. VARIABLE DECLARATION

* Default value for a varibale is NULL

* EXAMPLE
	do $$ 
	declare
	   counter    integer := 1;
	   first_name varchar(50) := 'John';
	   last_name  varchar(50) := 'Doe';
	   payment    numeric(11,2) := 20.5;
	   payment_at time := now();
	begin 
	   raise notice '% % % has been paid % USD at %', 
		   counter, 
		   first_name, 
		   last_name, 
		   payment,
		   payment_at; 
	   perform pg_sleep(5); -- pg_sleep() method is used to delay the execution
	   raise notice 'I''m print after the 10 sec';
	end $$; 
	
* COPY DATA TYPES
The %type provides the data type of a table column or another variable.

EXAMPLE:
	do $$ 
	declare
	   app_code_name api_keys.app_code%type; -- copy data type from table column
	   test_column app_code_name%type; -- copy data type from varibale
	begin 
	   select 
	   app_code into app_code_name
	   from api_keys
	   where id = 'c99ec06a-e60a-411e-93dc-e173df8583c0';
	   
	   raise notice 'API app code name is %', app_code_name;
	end; $$


6. ROW TYPES: store the whole row of a result set returned by the select into statement

	do $$
	declare
	   selected_actor actor%rowtype;
	begin
	   -- select actor with id 10   
	   select * 
	   from actor
	   into selected_actor
	   where actor_id = 10;

	   -- show the number of actor
	   raise notice 'The actor name is % %',
		  selected_actor.first_name, -- (first_name coulumn of actor table)
		  selected_actor.last_name; -- (last_name coulumn of actor table)
	end; $$
	
	
RECORD TYPES: similar to ROW TYPES

Example 1:
	do
	$$
	declare
		rec record;
	begin
		-- select the film 
		select film_id, title, length 
		into rec
		from film
		where film_id = 200;
		
		raise notice '% % %', rec.film_id, rec.title, rec.length;   
		
	end;
	$$
	language plpgsql;
	
Example 2:
	do
	$$
	declare
		rec record;
	begin
		for rec in select title, length 
				from film 
				where length > 50
				order by length
		loop
			raise notice '% (%)', rec.title, rec.length;	
		end loop;
	end;
	$$


7. CONSTANT VARIABLE
	constant_name constant data_type := expression;
	Example: vat constant numeric := 0.1;
	
	
















q