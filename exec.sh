#### !/bin/bash

# command line arguments
dir=$1
args0=$2
args1=$3

if [ -z "$1" ] 
then
	echo -e "---\nplease provide folder name\n---"
	return
fi

# fetching java file path from given directory
for entry in ./$dir/*.java 
do
  file_path=$entry
done


# extracting file name without extension
file="${file_path%.*}"
file_name="${file##*/}"

echo -e "$file_name\n---"

# to compile code
javac -d ./out $file_path

# to execute code
java -classpath ./out $file_name $args0 $args1