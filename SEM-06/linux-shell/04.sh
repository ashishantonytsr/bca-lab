# Menu based Calculator

# !/bin/bash
var=0

while [ $var -eq 0 ]
do
	echo -e "---\n1. Addition \n2. Substraction \n3. Multiplication \n4. Division"
	read -p "Enter your Choice >> " choice

	read -p "Enter number 1: " num1
	read -p "Enter number 2: " num2

	case $choice in
	1)
		result=$(echo "$num1 + $num2" | bc)
		;;
	2)
		result=$(echo "$num1 - $num2" | bc)
		;;
	3)
		result=$(echo "$num1 * $num2" | bc)
		;;
	4)
		result=$(echo "scale=2; $num1 / $num2" | bc)
		;;
	*)
		var=$(( $var + 1 ))
		;;
	esac

	echo -e "\nThe result is : $result\n"

	read -p "Do you wish to continue? (Y/N) : " cont
	if [ $cont != 'y' ] && [ $cont != 'Y' ]; then
		exit
	fi

done