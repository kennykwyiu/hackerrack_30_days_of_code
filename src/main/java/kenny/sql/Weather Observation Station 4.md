Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.

![img_1.png](img_1.png)


```roomsql
select count(*) - count(distinct city) as diff 
from station
```

For example, if there are three records in the table with CITY values 'New York', 'New York', 'Bengalaru', there are 2 different city names: 'New York' and 'Bengalaru'. The query returns 1