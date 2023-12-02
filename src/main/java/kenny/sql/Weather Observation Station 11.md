Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. 
Your result cannot contain duplicates.

![img_1.png](img_1.png)


```roomsql
SELECT DISTINCT CITY
FROM STATION
WHERE NOT (LOWER(SUBSTRING(CITY, 1, 1)) IN ('a', 'e', 'i', 'o', 'u')
   AND LOWER(SUBSTRING(CITY, -1)) IN ('a', 'e', 'i', 'o', 'u'));
```
```roomsql
SELECT DISTINCT CITY
FROM STATION
WHERE NOT (LOWER(CITY) LIKE 'a%' 
       OR LOWER(CITY) LIKE 'e%' 
       OR LOWER(CITY) LIKE 'i%' 
       OR LOWER(CITY) LIKE 'o%' 
       OR LOWER(CITY) LIKE 'u%')
   OR SUBSTRING_INDEX(REVERSE(LOWER(CITY)), ' ', 1) NOT LIKE 'a%' 
   AND SUBSTRING_INDEX(REVERSE(LOWER(CITY)), ' ', 1) NOT LIKE 'e%' 
   AND SUBSTRING_INDEX(REVERSE(LOWER(CITY)), ' ', 1) NOT LIKE 'i%' 
   AND SUBSTRING_INDEX(REVERSE(LOWER(CITY)), ' ', 1) NOT LIKE 'o%' 
   AND SUBSTRING_INDEX(REVERSE(LOWER(CITY)), ' ', 1) NOT LIKE 'u%';
```
