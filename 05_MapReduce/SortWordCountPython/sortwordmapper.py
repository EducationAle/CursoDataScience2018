#!/usr/bin/env python
import sys
for line in sys.stdin:
  line = line.strip()
  word,val = line.split('\t',1)
  print('%s\t%s' % (val.zfill(5), word))
