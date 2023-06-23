#! /usr/bin/bash
trap exit SIGINT

cd out
for (( i = 0; i != ${1:-1}; ++i ))
do
  java src/Client
done
