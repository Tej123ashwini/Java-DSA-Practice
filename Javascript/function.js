// Creating function

function add(a,b) {
    return a + b;
}

function subtract(a,b) {
    return a - b;
}

function multiplication(a,b) {
    return a * b;
}

function division(a,b) {
    return a / b;
}

function modulos(a,b) {
    return a % b;
}

function isEven(a,b) {
    if(a % b == 0) {
        return true;
    }
    else {
        return false;
    }
}

console.log(add(10,2));
console.log(subtract(10,2));
console.log(multiplication(10,2));
console.log(division(10,2));
console.log(modulos(10,2));
console.log(isEven(10,2));