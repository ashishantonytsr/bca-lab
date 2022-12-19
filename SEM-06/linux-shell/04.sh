# Menu based Calculator

# !/bin/bash
echo -e "====\nMENU\n----"
echo -e "1. Addition \n2. Substraction \n3. Multiplication \n4. Division"
read -p "Enter your Choice >> " choice


if [ $choice -gt 0 ] && [ $choice -lt 5 ]; then

	read -p "Enter number 1: " num1
	read -p "Enter number 2: " num2

	if [ $choice -eq 1 ]; then
		result=$(echo "$num1 + $num2" | bc)
	elif [ $choice -eq 2 ]; then
		result=$(echo "$num1 - $num2" | bc)
	elif [ $choice -eq 3 ]; then
		result=$(echo "$num1 * $num2" | bc)
	elif [ $choice -eq 4 ]; then
		result=$(echo "scale=2; $num1 / $num2" | bc)
	else
		echo "Invalid Option"
		exit
	fi

echo "The result is : $result"
fi


# ====
# MENU
# ----
# 1. Addition
# 2. Substraction
# 3. Multiplication
# 4. Division
# Enter your Choice >> 4
# Enter number 1: 8
# Enter number 2: 9
# The result is : .88