#!/bin/bash
echo "Enter three numbers: "
read a b c
sum=$((a + b + c))
mean=$(echo "scale=2; $sum / 3" | bc)
sd=$(echo "scale=2; sqrt(($a - $mean)^2 + ($b - $mean)^2 + ($c - $mean)^2) / 3" | bc -l)
echo "Mean: $mean"
echo "Standard Deviation: $sd"
