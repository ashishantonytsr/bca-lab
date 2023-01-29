# Gross Salary

# !/bin/bash
read -p "Enter the basic salary: " sal

if [ $sal -ge 1000 ]; then
	DA=$(echo "scale=2; $sal*40/100" |bc )
	HRA=$(echo "scale=2; $sal*20/100" |bc )
	gsal=$(echo "scale=2; $sal+$DA+$HRA" |bc )
fi

echo "Basic salary is $sal"
echo "DA is $DA"
echo "HRA is $HRA"
echo "Gross salary is $gsal"


# Expected output
# ---
# Enter the basic salary: 2552
# Basic salary is 2552
# DA is 1020.80
# HRA is 510.40
# Gross salary is 4083.20