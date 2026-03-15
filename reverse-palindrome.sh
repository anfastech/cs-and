#!/bin/bash
echo "Enter a string: "
read str
rev=$(echo $str | rev)
echo "Reverse: $rev"
if [ "$str" = "$rev" ]; then
    echo "Palindrome"
else
    echo "Not palindrome"
fi
