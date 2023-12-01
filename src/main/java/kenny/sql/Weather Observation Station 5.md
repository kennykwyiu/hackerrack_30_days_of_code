Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

![img_1.png](img_1.png)


```roomsql
select city, length(city) as length
from station
where length(city) = (
select min(length(city)) from station
)
order by city
limit 1;

select city, length(city) as length
from station
where length(city) = (
select max(length(city)) from station
)
order by city
limit 1;
```

```roomsql
select city, length(city) as length
from station
order by length, city
limit 1;

select city, length(city) as length
from station
order by length desc, city
limit 1;
```

Sample Input

For example, CITY has four entries: DEF, ABC, PQRS and WXY.

Sample Output

ABC 3
PQRS 4