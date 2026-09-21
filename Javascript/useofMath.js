// Math :- it is a built in object that provides a collection of properties and methods.


console.log("square root: ",Math.sqrt(25));
console.log("cube root: ",Math.cbrt(27));
console.log("power: ",Math.pow(2,2));

console.log("pi value: ",Math.PI);
console.log("E value: ",Math.E);


console.log("Round:", Math.round(4.7));  // it will print nearest integer
console.log("Floor:", Math.floor(4.7));  // it will print round down
console.log("Ceil:", Math.ceil(4.2));    // it will print round up
console.log("Trunc:", Math.trunc(4.7));   // it will print remove decimal part


console.log("max: ",Math.max(2,3,5,1));
console.log("min: ",Math.min(2,3,10,0));


//Trigonometric Functions
console.log(Math.sin(0));
console.log(Math.cos(0));
console.log(Math.tan(0));

//random number
console.log("Random:", Math.random());  // in btw 0 and 1 like 0.22822

console.log("Random 1-10:",
    Math.floor(Math.random() * 10) + 1
);                                        // it will print anyone number in btw 1-10

//Sign of a number
console.log("Sign:", Math.sign(-50));  //if the value is -ve prints -1
console.log("Sign:", Math.sign(50));  //if the value is +ve prints +1
