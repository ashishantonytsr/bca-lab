# Armstrong or not

# !/bin/bash
read -p "Enter the number: " num

sum=0
count=$(echo ` expr length $num `)
for (( n=$num; n>0; n=n/10 )); do
	rem=$(( n%10 ))
	sum=$(( sum+(rem**count) ))
done

if [ $sum -eq $num ]; then
	echo "$num is Armstrong number"
else
	echo "$num is not Armstrong number"
fi


# Expected output
# ---
# Enter the number: 153
# 153 is Armstrong number