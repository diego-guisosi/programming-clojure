;prefix notation
(+ 10 5)

;extend arbitrary number of arguments
(+ 1 2 3 4)

;eliminate logic for boundary conditions
(+)

;mathematical and comparison operators
(- 10 5)
(* 2 3)
(> 5 2)
(>= 5 5)
(< 5 2)
(= 2 2)

;division
(/ 22 7)                          ;ratio
(/ 22.0 7)                        ;decimal division
(quot 22 7)                       ;integer quotient
(rem 22 7)                        ;integer remainder
(+ 1 (/ 0.0001 1000000000000))    ;decimal math 
(+ 1 (/ 0.0001 1000000000000M))   ;arbitrary precision, floating-point math - BigDecimal (M)
(* 1000N 1000 1000 1000 1000)     ;arbitrary integer precision - BigInt (N)
