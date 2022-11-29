## Multi-Thread java program to display odd & even numbers
---
### Algorithm

*Step 01* : **Start**

*Step 02* : **Use a boolean variable odd; to print odd numbers, it's value should be true and vice versa to print even numbers**

*Step 03* : **Create two methods printOdd() and printEven() to print odd numbers and even numbers respectively**

*Step 04* : **Create two threads: t1 for odd & t2 for even**

*Step 05* : **Thread t1 will call printEven() method and t2 will call printOdd()**

*Step 06* : **If boolean odd is true in printEven() method, t1 will wait**

*Step 07* : **If boolean odd is false in printOdd() method, t2 will wait**

*Step 08* : **Stop**
