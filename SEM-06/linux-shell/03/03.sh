# Greatest of three numbers

# !/bin/bash
echo "Enter three numbers"
read n1
read n2
read n3

if [ $n1 -gt $n2 ] && [ $n1 -gt $n3 ]
then
	echo "$n1 is greater"
elif [ $n2 -gt $n3 ]
then
	echo "$n2 is greater"
else
	echo "$n3 is greater"
fi


# Expected output
# ---
# Enter three numbers
# 4
# 7
# 5
# 7 is greater