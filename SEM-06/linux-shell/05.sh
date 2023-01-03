# Sum of digits

# !/bin/bash
read -p "Enter the number : " num

sum=0
while [ $num -gt 0 ]
do
	dig=$(($num % 10))
	num=$(($num / 10))
	sum=$(($sum + $dig))
done

echo $sum


# Expected output
# ---
# Enter the number : 345
# 12