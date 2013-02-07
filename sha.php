#! /usr/bin/env php
<?php

$a = array_slice($argv, 1);

$s = $a[0];
echo bin2hex(sha1($s, true))." ".base64_encode(sha1($s, true));
?>
