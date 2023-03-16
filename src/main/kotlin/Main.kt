fun main(){
oddNumbers()
    drinks(2)
    drinks(14)
    drinks(20)
    numbering()
    var result=stringLength(arrayOf("kimani","mwendwa","rita","wangare","ashur","mohammed"))
    println(result)
}

//a function tha prints out odd numbers between 1-100
fun oddNumbers(){
    for(nums in 1..100){
        if(nums%2==1)
            println(nums)
    }
}

//a function that takes in array of names  and returns the number of names longer than 5 characters
fun stringLength(word: Array<String>):Int {
    var count = 0
    for (x in word) {
        if (x.length>5){
            count++
        }

    }
    return count}





// a function that makes a decision and prints out the name of the drink a person gets according to their age
fun drinks(Age:Int) {

    when {
        //prints out "serve a glass of milk" if under 6
        Age in 0..6 -> println("server a glass of milk")
        //prints out "serve a bottle of fanta orange if above 6 but below 15
        Age in 7..15 -> println("serve a cottle of fanta orange")
        //prints out "get a bottle of cocacola for guests above 15
        else -> println("get a botlle of cocacola")
    }
}




fun numbering(){
    //a function that prints out each number btn 1-100 in a new line
    for (num in 1..100){
        println(num.toString())
        //a function that prints out "fizzz" for each multiple of 3
        if (num %3==0){
            println("fizz")
        }
        //a function that prints out "buzz" for each a multiple of 5
        else if (num %5==0){
            println("Buzz")
        }
        //a function that prints out "fizzbuzz" for each multiple of 3&5
        else{(num %3==0 && num %5==0)
            println("FizzBuzz")

        }}
}







