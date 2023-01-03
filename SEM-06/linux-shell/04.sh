# Menu driven Calculator

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
		echo -e "\nThe result is  $(($num1 + $num2))"
		;;
	2)
		echo -e "\nThe result is  $(($num1 - $num2))"
		;;
	3)
		echo -e "\nThe result is  $(($num1 * $num2))"
		;;
	4)
		result=$(echo "scale=2; $num1 / $num2" | bc)
		echo -e "\nThe result is  $result"
		;;
	*)
		echo -e "\nInvalid Option"
		var=$(( $var + 1 ))
		;;
	esac

	read -p "Do you wish to continue? (Y/N) : " cont
	if [ $cont != 'y' ] && [ $cont != 'Y' ]; then
		exit
	fi

done