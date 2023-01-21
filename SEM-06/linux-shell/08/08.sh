# Factorial of a number

# !/bin/bash
read -p "Enter the number: " num

fact=1
for (( i=num; i>=1; i-- )); do
	fact=$(( fact*i ))
done

echo "The factorial of the number is $fact"


# Expected output
# ---
# Enter the number: 6
# The factorial of the number is 720