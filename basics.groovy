println "Hello World!"
// Comments
/* A few lines
comments.*/

//Define variables
println ""
println "======Define variables======="
def variable = "zmienna"
variable = "nowaZmienna"
println "Variable = $variable"


//Define lists
println ""
println "======Define list======="
def list = ["el1","el2",variable]
//HINT: Not using quotas "" will show variable.
println list
println "======Each======="
list.each{element -> println element}


//Define map
println ""
println "======Define map======="
def map = ["el1":1,"el2":2]
println map
println "======Each======="
map.each{key, value -> println value.collect{key}.join(',')}


//Define function
println ""
println "======Define function======="
def function(argument1="value",argument2="value2",argument3="value3")
{
println "Argument1 = $argument1"
println "Argument2 = $argument2"
println "Argument3 = $argument3"
}
function("OwnValue","OwnValueFor3")


//IF - conditional statement
println ""
println "======IF - conditional statement======="
def text = "One day someone will take a look at this line. Anyone?"
if(text.contains("Anyone"))
{
println "There is someone!"
}
else
{
println "Ouch, there is not."
}
println ""
println "======Another IF======="
def favoriteAnimals= ["cat","dog","rabbit"]
if(favoriteAnimals.contains("rabbit"))
{
println "Someone here like rabbits!"
}
else
{
println "Ouch, someone does not like rabbits here."
}


//Boolean algebra
println ""
println "======Boolean algebra======="
if(favoriteAnimals.contains("snake") && text.contains("Anyone"))
{
println "PASS - Both true."
}
else
{
println "FAIL - Unfortunatly, there is at least one false."
}

if(favoriteAnimals.contains("snak") || text.contains("Anyone"))
{
println "PASS - At least one of them is true."
}
else
{
println "FAIL - Unfortunatly, both of them are false."
}

//Loop while
println ""
println "======Loop while======="
/*while()
{

}
*/
