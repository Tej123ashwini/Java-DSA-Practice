// String Methods

let name = "Tejashwini  ";
let num = "123-456-789";

console.log("Length of the string: " + name.length);                            // Length of the string
console.log("String in uppercase: " + name.toUpperCase());                      // String in uppercase
console.log("String in lowercase: " + name.toLowerCase());                      // String in lowercase
console.log("Character at index 2: " + name.charAt(2));                         // Character at index 2
console.log("Index of 'wini': " + name.indexOf('wini'));                        // Index of 'wini'
console.log("String after removing whitespace: '" + name.trim() + "'");        // String after removing whitespace
console.log("Last index of 'i': " + name.lastIndexOf('i'));                      // Last index of 'i'


let newnum = num.replaceAll("-","/");
console.log(newnum);

// Slicing          str.slice(start, end)  -  Returns a section of a string

let firstname = name.slice(0,2);
let lastname = name.slice(5, 10);
let last = name.slice(-3);

console.log(firstname);
console.log(last);

console.log(name.indexOf("w"))

