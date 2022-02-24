# <p align="center">**_Symfony Commands_**</p>
<br>

## **1. Symfony Server**

1. Server run    

        symfony server:start
2. Server run in backround

        symfony server:start -d
3. Server stop

        symfony server:stop
<br>

## **2. Cache Clear**

    php bin/console cache:clear
<br>

## **3. Project create**

1. Create project for traditional web application

        composer create-project symfony/skeleton project_dir
        cd project_dir
        composer require webapp
2. Create project for a microservice, console or API

        composer create-project symfony/skeleton project_dir
<br>

## **3. User Password Change**

    php bin/console fos:user:change
<br>


