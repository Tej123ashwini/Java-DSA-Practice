//type conversion :-  changing a value from one data type to another.
//                      (String,Boolean,Number)
// basicsOfJS.html file is linked to this file. so we can see the output in console of browser.



//example 1  ---  String to Number

let x = window.prompt("Please enter a number: ");

x = Number(x);  /*without Number() it will be treated as string 
                and concatenated with 1 instead of adding 1 to it. */

x +=1;

console.log(x, typeof x);



//eexample 2

let a="abc";
let b="xyz";
let c= 22;

a = Number(a); // if we give a non-numeric string, it will return NaN(not an number)
b = Boolean(b); //true
c = String(c); // we can also use this variable.toString() to convert num --> str.

console.log(a, typeof a); // it gives undefined when we are not store anything in variable.

// In boolean non empty string is true and empty string is false.
console.log(b, typeof b); //undefined

console.log(c, typeof c); //undefined


//example 3

// parseInt() converts a value into an integer

let value = "123.456";

// let result = parseInt(value);
let result = parseFloat(value);

console.log(result);
