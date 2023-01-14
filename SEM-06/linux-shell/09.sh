# Factorial of a number

# !/bin/bash
echo "Enter the numbers "
read n1
read n2
read n3

mean=$(( (n1+n2+n3)/3 ))

x=$(( (n1-mean)**2 ))
y=$(( (n2-mean)**2 ))
z=$(( (n3-mean)**2 ))
variance=$(echo "scale=2; ($x+$y+$z)/3" |bc)
sd=$(echo "scale=2; sqrt($variance)" |bc)

echo "Mean is $mean"
echo "variance is $variance"
echo "Standard deviation is $sd"


# Expected output
# ---
# Enter the numbers 
# 10
# 12
# 23
# Mean is 15
# variance is 32.66
# Standard deviation is 5.71