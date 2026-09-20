// const :- a variable that can not be reassigned.

const PI = 3.14;  // constant variable
let radius;
let circumference;


document.getElementById("button").onclick = function() {
    radius = document.getElementById("mytext").value;

    radius = Number(radius);

    circumference = 2 * PI * radius;

    document.getElementById("result").textContent = "Circumference is: " + circumference;
}
