//how to accept user input in javascript
            // easy way -- window prompt() method
            // professional way -- HTML textbox

/* 
 // easy way to accept user input in javascript

let userinput = window.prompt("Please enter your name: ");

console.log(userinput);

*/

// professional way to accept user input in javascript

let input ;

document.getElementById("submit").onclick = function() {
    input = document.getElementById("name").value;
    console.log(input);
    document.getElementById("myh1").textContent = `hello ${input}`;
}
