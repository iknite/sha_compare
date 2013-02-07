SHA1 compare
============

Compare throught sha1+base64 functions in **php**, **python** and **java** to test cross-stability.
Uses **node** as runner. 

Now it's stable, but we struggled with java a while to find `the good` class after hating the 
`the bad` and taunting `the ugly` classes.

History
-------

Sadly it has differents SHA1 digest interpreters, 10 different specifications to transform in base64,
so we had wasted time in this basic app.

Usage
-----

```sh
./sha_compare -- 'string_test' 
./sha_compare 100 
```
dumps the sha1 in hexadecimal then sha1+base64 transformation of the `string_test` in the 3 platforms

Installation
------------

```sh
npm install #in the project folder
```

Changing the java and not compiling is not a good idea, run `javac sha.java` then the `sha_compare`

---
v0.1 by `iknite` with love @2013 
