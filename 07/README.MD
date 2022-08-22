## Base Conversion of Decimal numbers

### Algorithm

*Step 01* : **Start**

*Step 02* : **Read Decimal number as NUM & Base to be converted as BASE**

*Step 03* : **Declare char array RES, count = 0**

*Step 04* : **Set rem = NUM % BASE**

*Step 05* : **Set digit = '0' + rem**

*Step 06* : **if digit > '9', set digit = digit + 7**

*Step 07* : **RES[count] = digit**

*Step 08* : **increment count by 1**

*Step 09* : **Update NUM = NUM / BASE**

*Step 10* : **While p &#8800; 0, repeat steps 4 to 9**

*Step 09* : **Print array RES in reverse order**

*Step 10* : **Stop**