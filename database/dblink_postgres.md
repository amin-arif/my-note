## **Link connection from One DB to another DB**

Retrieve data from another DB and also use these data from host DB like user check condition

<br>

```sql
SELECT * FROM dblink('host=192.168.100.100 user=postgres password=123456 dbname=org_kyc options=-csearch_path=',
'select username, fullname, email, mobile from public.employees')
AS employees(agency_name character varying, username character varying, fullname character varying, email character varying, mobile character varying)
WHERE username = 'arif';
```

[Learn more](https://www.educba.com/postgresql-dblink/)
