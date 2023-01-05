# Prime numbers upto limit

# !/bin/bash
read -p "Enter the limit: " limit

echo "The prime numbers upto the limit are: "
for (( num=2; num<=$limit; num++ )); do
	
	isPrime=1
	for (( i=2; i<=$(( $num/2 )); i++ )); do
		if [[ $num%$i -eq 0 ]]; then
			((isPrime++))
			break
		fi
	done

	if [ $isPrime -eq 1 ]; then
		echo "$num"
	fi
done


# Expected output
# ---
# Enter the limit: 5
# The prime numbers upto the limit are:
# 2
# 3
# 5