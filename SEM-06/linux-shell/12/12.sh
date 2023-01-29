# Palindrome string

# !/bin/bash
read -p  "Enter the string: " str

len=$(echo -n "$str" | wc -c)
for (( i=len-1; i>=0; i-- )); do
	rev+="${str:$i:1}"
done

echo "The reverse of the string is $rev"
if [[ $str == $rev ]]; then
	echo "The string is palindrome."
else
	echo "The string is not palindrome."
fi


# Expected output
# ---
# Enter the string: malayalam
# The reverse of the string is malayalam
# The string is palindrome.