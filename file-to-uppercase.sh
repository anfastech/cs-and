#!/bin/bash
echo "Enter filename: "
read file
if [ -f $file ]; then
    tr '[:lower:]' '[:upper:]' < $file > temp.txt
    mv temp.txt $file
    echo "Converted to uppercase"
else
    echo "File not found"
fi
