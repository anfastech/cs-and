#!/bin/bash

echo "Enter a number"

read n

if [ $(( n % 2  )) -eq 0 ]; then
	echo "$n number is even"
else
	echo "$n number is odd"
fi
