# Reverse of a number

# !/bin/bash
read -p "Enter the number: " num

rev=0
while [ $num -gt 0 ]; do
	dig=$(( $num%10 ))
	num=$(( $num/10 ))
	rev=$(( ($rev*10)+$dig ))
done
echo "The reverse of the number is $rev"


# Expected output
# ---
# Enter the number: 123
# The reverse of the number is 321