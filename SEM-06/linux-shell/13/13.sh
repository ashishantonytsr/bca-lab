# Number of line, words & characters in a file

# !/bin/bash
read -p "Enter the filename: " file

chars=`cat $file | wc -c`
words=`cat $file | wc -w`
lines=`cat $file | wc -l`

echo "Number of characters in $file is $chars"
echo "Number of words in $file is $words"
echo "Number of lines in $file is $(($lines+1))"


# Expected output
# ---
# Enter the filename: 12.sh
# Number of characters in 12.sh is 319
# Number of words in 12.sh is 59
# Number of lines in 12.sh is 12
