;;;; Decribe Program
(defun hello()
	(format t "Hello, Lisp world! ~%")
)

(hello)

(print "What's your name")

(defvar *name* (read))

(defun hello-you(*name*)
	(format t "Hello ~a! ~%" *name*)
)

;;; ~a shows the value
;;; ~s shows the quotes with value
;;; ~10a add extra 10 space right
;;; ~10@a add extra 10 space left

(setq *print-case* :capitalize)

(hello-you *name*)

(defun mean()
  (format t "Hello world! ~%")
)

(mean)

(defvar *number* 0)

(setf *number* 6)
