**_<h1 align="center">Database Commands</h1>_**

</br>

## **1. Database Import, Export with Gunzip**

1. Import

        gunzip < db_file.sql.gz | mysql -u user -p database_name

        Display progess bar:
        pv db_file.sql.gz | gunzip | mysql -u user -p database_name

2. Export

        mysqldump -u user -p database_name | gzip > db_file.sql.gz

</br>

## **2. Databasae**
