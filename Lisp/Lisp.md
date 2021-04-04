# Lisp


```lisp
;;;; Four semicolons used for a file header comment

;;; comment with three semicolons usually be a paragraph
(defun hello()
	(print "Lisp")
	(format t "Hello, Lisp world! ~%") ; for this line only
)
;; Two semicolons comment indicate that comment applies
;; to the code that follows.

#||
(load "d:\\Coding\\Lisp\\hello.lisp")
(setq a nil)
(push 4 a)
(pop a)
(- 1 2)
||#
```

## Data

(defvar)


## IO

(read)

## Function

(defun hello()
	(format t "Hello, Lisp World! ~%")
)