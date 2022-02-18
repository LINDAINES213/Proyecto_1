(
  defun factorial (num)
    (
      if(= num 0) 1
        (* num (factorial (- num 1)))
    )
)

(print "Ingrese un numero: ")
(setq numero (read))
(print (factorial numero))