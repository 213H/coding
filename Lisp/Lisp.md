[lisp-video](https://www.bilibili.com/video/BV1KW411s7MG)

[ansi-common-lisp](../../Bookset/编程/ANSI&#32;Common&#32;Lisp.pdf)

[land-of-lisp](../../Bookset/编程/Land&#32;of&#32;Lisp.pdf)

[lisp-v](https://www.bilibili.com/video/BV1Gz41187KG)

```
;;;; Four semicolons used for a file header comment

;;; comment with three semicolons usually be a paragraph
(defun hello()
	(print "Lisp")
	(format t "Hello, Lisp world!") ; for this line only
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