## **Upadate a table using another table data**

<br>

```sql
UPDATE geography SET id = cl.id
FROM country_level AS cl
WHERE geography.country_code = cl.country_code;
```
