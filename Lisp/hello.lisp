
(defun hello()
	(format t "Hello, Lisp world! ~%")
)

(hello)

(defvar *name* (read))

(defun hello-you(*name*)
	(format t "Hello ~a! ~%" *name*)
)

(setq *print-case* :capitalize)

(hello-you *name*)

(defun mean()
  (format t "Hello world! ~%")
)
