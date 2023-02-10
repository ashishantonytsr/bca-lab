# Greeting message based on the time of execution

# !/bin/bash
time=`date +"%H"`

if [ $time -ge 9 ] && [ $time -lt 12 ]; then
	echo "Good Morning"
elif [ $time -ge 12 ] && [ $time -lt 16 ]; then
	echo "Good Afternoon"
elif [ $time -ge 16 ] && [ $time -lt 20 ]; then
	echo "Good Evening"
fi

echo "The time is $(date +"%H:%M")"


# Expected output
# ---
# Good Evening
# The time is 17:01