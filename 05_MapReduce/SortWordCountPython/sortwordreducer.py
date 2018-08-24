#!/usr/bin/env python
import sys

for line in sys.stdin:
    line = line.strip()
    val,word = line.split('\t', 1)
    print('%s\t%d' % (word,int(val)))