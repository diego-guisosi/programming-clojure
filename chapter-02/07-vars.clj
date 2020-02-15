;Var - stores objects declared by def or defn
(def light-speed "300.000 km/s")       ;def binds the symbol light-speed to the var that will store the value "300.000 km/s"

;Accessing the value of a var... just let clojure evaluate the symbol bound to the var
light-speed

;Accessing the var itself... use var or its reader macro #'
(var light-speed)
#'light-speed

;Besides storing values, vars can have metadata (documentation, type hints and unit tests)
