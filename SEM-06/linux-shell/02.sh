# Check whether the number is odd or even

# !/bin/bash
read -p "Enter the number: " num

num_mod_2=$(echo "$num % 2" | bc)

if [ $num_mod_2 -eq 0 ]
then
	echo "Even Number"
else
	echo "Odd Number"
fi


# Expected output
# ---
# Enter the number: 35
# Odd Number