;defn - function definition
;   First Form
;   (defn name doc-string? attr-map? [params*] prepost-map?  body)
;         name is the name of the function
;         doc-string? is an optional string describing the function
;         attr-map? is an optional map to add metadata to the function
;         [params*] is a vector that will contain the parameters received by the function
;         prepost-map? is an optional map to add preconditions and postconditions to the function
;         body contains any number of expressions whose evaluation of the last one will yield the return value
(defn greeting
  "Returns a greeting in the form of 'Hello, username'"
  [username]
  (str "Hello, " username))


;   Second Form
;   (defn name doc-string? attr-map? ([params*] body)+)
;         this form enables the definition of different behavior to different number of arguments
(defn greeting
  "Returns a default greeting if no parameter is provided 
   or the form of 'Hello, username' if at least one parameter is provided"
  ([] (greeting "world"))
  ([username] (str "Hello, " username)))


;& variable nummber of arguments
(defn date [person-1 person-2 & chaperones]
  (println person-1 " and " person-2 " went out with " (count chaperones) " chaperones"))
