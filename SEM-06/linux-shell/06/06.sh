# Fibonacci series of N numbers

# !/bin/bash
read -p "Enter the number: " num

echo -n "Fibonacci numbers are : "
f=0
s=1
echo -n "$f $s "

for (( i=2; i<$num; i++ ))
do
	t=$(( $f + $s ))
	echo -n "$t "
	f=$s
	s=$t
done


# Expected output
# ---
# Enter the number: 6
# Fibonacci numbers are : 0 1 1 2 3 5