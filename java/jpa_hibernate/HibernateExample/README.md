### It is a simple Hibernate project for learning purpose.

[Project Source](https://www.digitalocean.com/community/tutorials/hibernate-tutorial-for-beginners#hibernate-tutorial-for-beginners)

</b>

Employee Table:

```sql
CREATE TABLE IF NOT EXISTS public.test_employees
(
    id integer NOT NULL DEFAULT 'nextval('test_employee_id_seq'::regclass)',
    name character varying COLLATE pg_catalog."default",
    role character varying COLLATE pg_catalog."default",
    insert_time timestamp without time zone,
    CONSTRAINT test_employee_pkey PRIMARY KEY (id)
)
```

</b>

### To run specific main file in Maven project

	mvn compile exec:java -Dexec.mainClass="com.arif.hibernate.main.HibernateMain"

