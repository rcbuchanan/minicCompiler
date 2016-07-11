#!/bin/sh

for test in `ls tests/*/*.minc | sed -e 's/\(.*\)\.minc/\1/'`
	do java -jar dist/nameanalyser.jar <${test}.minc >${test}.out;
	echo "------------------>               DIFF FOR ${test}"
	diff ${test}.minc.reference ${test}.out;
done;
