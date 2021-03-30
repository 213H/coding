## SQL

SQUEL SQL
Structed Query Language

## MS SQL SERVER

### install 
默认实例 unique

命名实例

### Transact-SQL

DDL//Define
create
drop
alter

DML//Manipulation
insert into  values
update set where
delete from where

DCL//Control
grant 
revoke

DQL/Query
select from where

show
use
character set

DPL

CCL

esec sp_helpdb database

## MySQL

Oracle收购
关系型数据库

[mosh](https://www.bilibili.com/video/BV1UE41147KC)

### SQL DML 和 DDL
可以把 SQL 分为两个部分：数据操作语言 (DML) 和 数据定义语言 (DDL)。
SQL (结构化查询语言)是用于执行查询的语法。但是 SQL 语言也包含用于更新、插入和删除记录的语法。

查询和更新指令构成了 SQL 的 DML 部分：

    SELECT - 从数据库表中获取数据
    UPDATE - 更新数据库表中的数据
    DELETE - 从数据库表中删除数据
    INSERT INTO - 向数据库表中插入数据
    SQL 的数据定义语言 (DDL) 部分使我们有能力创建或删除表格。我们也可以定义索引（键），规定表之间的链接，以及施加表间的约束。

SQL 中最重要的 DDL 语句:

    CREATE DATABASE - 创建新数据库
    ALTER DATABASE - 修改数据库
    CREATE TABLE - 创建新表
    ALTER TABLE - 变更（改变）数据库表
    DROP TABLE - 删除表
    CREATE INDEX - 创建索引（搜索键）
    DROP INDEX - 删除索引
#### primary key
    CREATE TABLE Persons
    (
    Id_P int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
    PRIMARY KEY (Id_P)
    )
#### query
    use world;
    select * 
    -- select Name
    -- select distinct Name
    from city
    where CountryCode = 'NLD' OR CountryCode = 'AFG'
    order by Population
    limit 30;
    -- insert into
    -- update
    -- delete
---
    create database myDatabase
    use myDatabase;
    create table movies(
        ID int(40) NOT NULL unique,
        Code varchar(15),
        actress varchar(63),
        Title varchar(255),
        Tags varchar(255),
        Length int(7),
        magnet varchar(255),
        primary key(ID)
        )ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
---
    use myDatabase;
    create table actress(
        ID INT UNSIGNED AUTO_INCREMENT,
        Name varchar(255),
        Brithday date,
        Height varchar(255),
        Cup varchar(255),
        Place varchar(255),
        primary key(ID)
        )ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
---
    use myDatabase;
    insert into movies (ID,Code,actress,Title,Tags,Length,magnet)
        values
        (1,'2018-06-06','金秘书为何那样','김비서가 왜 그럴까','喜剧 / 爱情',60,'https://movie.douban.com/subject/30181455/')
---
    and or not
---
    select * 
    from customers
    where state = 'VA' OR state = 'FL' OR state = 'GA'
    -- WHERE state IN ('VA', 'FL', 'GA')
    -- WHERE state NOT IN

    SELECT * 
    FROM customers
    WHERE points BETWEEN 3000 AND 1000

    SELECT * 
    FROM customers
    WHERE LIKE 'b%' --- '%b%' 
    -- % any number character

    WHERE LIKE '_y'
    -- _ single character

    -- NOT LIKE

    WHERE last_name REGEXP 'field' | '^field' | 'field$' | 'field|mac|rose' | '[gim]e' = ge, ie, me | '[a-h]e'
    REGEXP
    -- ^ begining
    -- $ end
    -- | or
    -- [abcd] single character
    -- [a-h] range

    -- ORDER BY
    -- ORDER BY state DESC
    -- ORDER BY state, first_name //order state then order first_name
    -- ORDER BY state DESC, first_name DESC

    -- LIMIT 3 //end
    -- LIMIT 6, 3 //jump 6 records
    -- LIMIT 5 OFFSET 5 // 6 TO 10
    -- PAGE 1: 1 - 3
    -- PAGE 2: 4 - 6
    -- PAGE 3: 7 - 9

    -- 内连接 inner joins
    SELECT *
    FROM orders o --short
    INNER JOIN customers
        ON orders.customer_id = customers.customer_id
    
    -- 跨数据库连接 joins across database
    SELECT*
    FROM order_items oi
    JOIN sql_inventory.porduct p
        ON oi.product_id = p.product_id

    -- 自连接 self joins
    USE sql_hr;

    SELECT *
    FROM employees e
    JOIN employees m
        ON e.reports_id = m.employee_id

    -- 多表连接
    SELECT *
    FROM orders o
    JOIN customers c
    ON o.customer_id = c.customer_id
    JOIN order_statuses os
    ON o.status = os.order_status_id
## NoSQL

非关系型数据库

Redis key/value 哈希表
