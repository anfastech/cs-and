#!/bin/bash
echo "Enter base and exponent: "
read base exp
result=$(echo "$base^$exp" | bc)
echo "$base^$exp = $result"
