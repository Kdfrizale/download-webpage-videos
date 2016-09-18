#!/bin/bash
#Script to download all videos from a webpage

java fomatter $1 > output.txt
sed -i 's/http/ http/g' output.txt
sed -i 's/ /\n/g' output.txt
youtube-dl -citk -f mp4 -a output.txt
rm output.txt
rm $1
echo "Process Complete"
