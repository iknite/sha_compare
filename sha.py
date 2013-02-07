#! /usr/bin/env python

from hashlib import sha1
import sys

a = sys.argv[1] 
print '{0} {1}'.format(sha1(a).hexdigest(), sha1(a).digest().encode('base-64')),
