#!/bin/bash

echo "Menu Driven Calculator"
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
echo "Enter choice: "
read ch
echo "Enter two numbers: "
read a b

case $ch in
	1) res=$(echo "$a + $b" | bc);;
	2) res=$(echo "$a - $b" | bc);;
	3) res=$(echo "$a * $b" | bc);;
	4) res=$(echo "scale=2; $a / $b" | bc);;
	*) echo "Invalid choice"; exit;;
esac
echo "Result: $res"

