;true - almost everything is true
(if true "true is true" "false is not true")              ;out -> true is true
(if () "empty list is true" "empty list is not false")    ;out -> empty list is true
(if 0 "zero is true" "zero is not false")                 ;out -> zero is true
(if false "false is not true" "false is false")           ;out -> false is false
(if nil "nil is not true" "nil is false")                 ;out -> nil is false

;predicate functions - name usually ends with ?
(true? true)
(false? false)
(nil? nil)
(zero? 0.0)
(find-doc #"\?$")                                         ;finds all functions whose name ends with a question mark (?)
                                                          ;# declares a regular expression literal
