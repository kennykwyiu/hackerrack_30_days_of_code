Consider P1(a,b) and P2(c,d) to be two points on a 2D plane.

a happens to equal the minimum value in Northern Latitude (LAT_N in STATION).
b happens to equal the minimum value in Western Longitude (LONG_W in STATION).
c happens to equal the maximum value in Northern Latitude (LAT_N in STATION).
d happens to equal the maximum value in Western Longitude (LONG_W in STATION).
Query the Manhattan Distance between points P1 and P2 and round it to a scale of 4 decimal places.

Manhattan distance
(definition)

Definition: The distance between two points measured along axes at right angles. 
In a plane with p1 at (x1, y1) and p2 at (x2, y2), it is |x1 - x2| + |y1 - y2|.

![img_1.png](img_1.png)


```roomsql
SELECT ROUND(ABS(MIN(LAT_N) - MAX(LONG_W)) + ABS(MAX(LAT_N) - MIN(LONG_W)), 4)
FROM STATION;
```