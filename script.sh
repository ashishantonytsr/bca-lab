#### !/bin/bash

# read args
dir=$1
file=$2

# check args
if [ $# -lt 2 ]; then
  echo "not enough arguments"
  return
fi

# for java commandLine args
args0=$3
args1=$4

# to compile code
javac -d ./out ./$dir/$file.java

# to execute code
java -classpath ./out $file $args0 $args1