# Gross Salary

# !/bin/bash
read -p "Enter the basic salary: " bsal

if [ $bsal -ge 1000 ]; then
	DA=$(( $bsal * 40/100 ))
	HRA=$(( $bsal * 20/100 ))
	gsal=$(( $bsal + $DA + $HRA ))
	
	echo "Gross salary is $gsal"
fi


# Expected output
# ---
# Enter the basic salary: 2500
# Gross salary is 4000