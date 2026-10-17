// IF-ELSE STATEMENT


const myText = document.getElementById("mytext");
const myButton = document.getElementById("mySubmit");
const myOutput = document.getElementById("result");
let age;

myButton.onclick = function() {
    age = myText.value;

    if(age >=18) {
        myOutput.textContent = "you can vote.";
    } else if(age < 0) {
        myOutput.textContent = "you are not born yet.";
    } else {
        myOutput.textContent = "you can not vote.";
    }
}



// ternary operator

// let age =21;
// let msg = age >=18 ? "U can vote" : "U can not vote";
// console.log(msg);
