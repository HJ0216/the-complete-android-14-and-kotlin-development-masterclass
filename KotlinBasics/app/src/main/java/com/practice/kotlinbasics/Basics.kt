package com.practice.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)

fun main(){
/*    val coffeeForHJ = CoffeeDetails(0, "HJ", "Tall", 0);
    makeCoffee2(coffeeForHJ);

    val number1 = 1;
//    number1 = 2;
    // val: 상수 할당
    // 기본값으로 val -> 변경 가능성이 있을 경우, var 사용 권장

    var number2 = 2;
    number2 = 3;
    
    println("Hello, Android World!");

    var number3 = 13; // 타입 명시 X: 자동으로 Int 할당
//    number3 = 123456789123; // Int보다 큰 값을 재할당 할 수 X

    var number4: Long = 13; // 타입 명시
    number4 = 123456789123;

    val pi = 3.14; // Double
    val piF = 3.14f; // Float

    var pi2 = 3.1415926535897932f;
    println(pi2); // 3.1415927

    var pi3 = 3.1415926535897932;
    println(pi3); // 3.141592653589793

    var number5: UShort = 35u; // 음수를 사용하지 않고 양의 방향으로 2배의 데이터 크기까지 입력 가능
    println(number5);

    val myTrue: Boolean = true;
    val myFalse: Boolean = false;
    val myNull: Boolean? = null;

    println(myTrue || myFalse); // true
    println(myTrue && myFalse); // false
    println(!myTrue); // false

    println(myNull); // null
//    println(myNull && myTrue); // Required Boolean

//    val myChar1 = 'as';
    val myChar1 = '1';
    println(myChar1);

    val myChar2 = '\u00AE';
    println(myChar2);

    val name = "Kim";

    var age = 20;

    if(age > 20){
        println("Welcome to the show!");
    } else {
        println("Welcome to the DisneyLand!");
    }

    val enteredValue = readln();
    age = enteredValue.toInt();

    if(age in 21..39){
        println("20 ~ 39");
    } else if(age in 40 .. 59){
        println("40 ~ 59");
    } else {
        println("");
    }

    var count = 0;

    while(count <= 3){
        count++;
        println(count);
    }

    val num1 = readln().toInt();
    val num2 = readln().toInt();
    val result = divide(num1,num2);
    println("$result");

    val daisy = Dog("Datty", "Chi");
    println("${daisy.breed} breed");

    val myBook = Book();
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}");

//    myBook.title = "No Defalut"; - val
    myBook.author = "Author";

    val customBook = Book("책", "저자", 2023);
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}");*/

    // immutable list
    val shoppingList = listOf("A", "B", "C", "D");
    // mutable list - you can add items later and modify
    val shoppingList2 = mutableListOf<String>("A", "B", "C", "D");
    shoppingList2.add("E");
    shoppingList2.remove("B");

    println(shoppingList2);

    shoppingList2.add(0, "F");
    println(shoppingList2);
    println(shoppingList2[0]);

    shoppingList2[3] = "G";
    println(shoppingList2);

    shoppingList2.set(2, "H");
    println(shoppingList2)

    println(shoppingList2.contains("A"))
    println(shoppingList2.contains("D"))

    for (item in shoppingList2){
        println(item)

        if(item == "A")
            break
    }

    // return index
    for(item in 0 until shoppingList2.size){
        println(item)
    }

    for (item in 0 .. shoppingList2.size-1){
        println(item)
    }
}

/*
fun divide(num1: Int, num2: Int): Double{
    return num1 / num2.toDouble();
}

fun add(num1:Int, num2:Int): String{
    val sum = num1 + num2;
    return "The result is $sum";
}

fun askCoffeeDetails(){
    println("Who");
    val customer = readln();
    println("Sugar");
    val sugar = readln().toInt();

    makeCoffee(sugar, customer);
}

fun makeCoffee(sugarCount:Int, name:String){
    if (sugarCount == 0)
        println("Coffee with no sugar for $name.");
    else if (sugarCount == 1)
        println("Coffee with $sugarCount spoon of sugar for $name.");
    else
        println("Coffee with $sugarCount spoons of sugar for $name.");
}
fun makeCoffee2(coffeeDetails: CoffeeDetails){
    if (coffeeDetails.sugarCount == 0)
        println("Coffee with no sugar for ${coffeeDetails.name}");
    else if (coffeeDetails.sugarCount == 1)
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}");
    else
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}");
}*/
