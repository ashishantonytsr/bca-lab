# !/bin/bash

date=`date +"%H"`

if [ $date -ge 9 ] && [ $date -lt 12 ]; then
	echo "Good Morning"
elif [ $date -ge 12 ] && [ $date -lt 16 ]; then
	echo "Good Afternoon"
elif [ $date -ge 16 ] && [ $date -lt 20 ]; then
	echo "Good Evening"
fi

echo "The time is $(date +"%H:%M")"