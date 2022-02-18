(
  defun fibonacci(num1)
  (
    cond ((= num1 0) 0)
    (t (cond((= num1 1) 1)
    (t (+ (fibonacci(- num1 1)) (fibonacci(- num1 2)) ))
    )
    )
  )
)

(print "Ingrese un numero: ")
(setq numero1 (read))
(print (fibonacci numero1))
