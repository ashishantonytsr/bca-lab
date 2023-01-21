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
sd=$(echo "scale=2; sqrt(($x+$y+$z)/3)" |bc)

echo "Mean is $mean"
echo "Standard deviation is $sd"


# Expected output
# ---
# Enter the numbers 
# 10
# 12
# 23
# Mean is 15
# Standard deviation is 5.71